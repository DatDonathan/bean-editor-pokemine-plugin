package at.jojokobi.pokemine.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.beaneditor.serialization.SerializationException;
import at.jojokobi.beaneditor.serialization.TemporarySerializatizerData;

public abstract class FileFuzer<T extends TemporarySerializatizerData> {

	private File src1;
	private File src2;
	private File dst;
	private ObjectSerializer<T> serializer;
	private T t;
	
	public FileFuzer(File src1, File src2, File dst, ObjectSerializer<T> serializer, T t) {
		super();
		this.src1 = src1;
		this.src2 = src2;
		this.dst = dst;
		this.serializer = serializer;
		this.t = t;
	}
	
	public void fuze (File file, String path) {
		File file2 = new File(src2, path + File.separator + file.getName());
		System.out.println(file + "/" + file2);
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				fuze (f, file == src1 ? "" : path + File.separator + file.getName());
			}
		}
		else if (file.getName().endsWith(serializer.getFileExtension()) && file2.exists() && file2.getName().endsWith(serializer.getFileExtension())) {
			System.out.println("Fuzing " + file.getPath() + " and " + file2.getPath() + " ...");
			try (InputStream in1 = new FileInputStream(file);
					InputStream in2 = new FileInputStream(file2)){
				Object obj1 = serializer.deserialize(in1, t);
				Object obj2 = serializer.deserialize(in2, t);
				
				File folder = new File(dst, path);
				folder.mkdirs();
				File goal = new File(folder, file.getName().substring(0, file.getName().length() - serializer.getFileExtension().length()) + serializer.getFileExtension());
				serializer.serialize(fuze(obj1, obj2), new FileOutputStream(goal), t);
				System.out.println("Success");
			} catch (SerializationException | IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fuze () {
		System.out.println("Fuzing");
		fuze(src1, "");
	}
	
	public abstract Object fuze (Object obj1 , Object obj2);
}
