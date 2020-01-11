package at.jojokobi.pokemine.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.beaneditor.serialization.SerializationException;
import at.jojokobi.beaneditor.serialization.TemporarySerializatizerData;

public class FileConverter<T extends TemporarySerializatizerData, E extends TemporarySerializatizerData> {
	
	private File src;
	private File dst;
	private ObjectSerializer<T> deserializer;
	private T t;
	private ObjectSerializer<E> serializer;
	private E e;
	
	
	public FileConverter(File src, File dst, ObjectSerializer<T> deserializer, T t, ObjectSerializer<E> serializer,
			E e) {
		super();
		this.src = src;
		this.dst = dst;
		this.deserializer = deserializer;
		this.t = t;
		this.serializer = serializer;
		this.e = e;
	}

	public void convert (File file, String path) {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				convert (f, path + File.separator + file.getName());
			}
		}
		else if (file.getName().endsWith(deserializer.getFileExtension())) {
			System.out.println("Converting " + file.getPath() + " ...");
			try {
				Object obj = deserializer.deserialize(new FileInputStream(file), t);
				File folder = new File(dst, path);
				folder.mkdirs();
				File goal = new File(folder, file.getName().substring(0, file.getName().length() - deserializer.getFileExtension().length()) + serializer.getFileExtension());
				serializer.serialize(obj, new FileOutputStream(goal), e);
				System.out.println("Success");
			} catch (FileNotFoundException | SerializationException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void convert () {
		System.out.println("Converting");
		convert(src, "");
	}

}
