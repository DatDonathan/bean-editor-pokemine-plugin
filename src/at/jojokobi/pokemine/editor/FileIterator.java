package at.jojokobi.pokemine.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.beaneditor.serialization.SerializationException;
import at.jojokobi.beaneditor.serialization.TemporarySerializatizerData;

public class FileIterator<T extends TemporarySerializatizerData, E extends TemporarySerializatizerData> {
	
	private File src;
	private ObjectSerializer<T> deserializer;
	private T t;
	

	public FileIterator(File src, ObjectSerializer<T> deserializer, T t) {
		super();
		this.src = src;
		this.deserializer = deserializer;
		this.t = t;
	}

	public void iterate (File file, String path) {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				iterate (f, path + File.separator + file.getName());
			}
		}
		else if (file.getName().endsWith(deserializer.getFileExtension())) {
			System.out.println("Loading " + file.getPath() + " ...");
			try {
				Object obj = deserializer.deserialize(new FileInputStream(file), t);
				System.out.println(obj);
			} catch (FileNotFoundException | SerializationException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void iterate () {
		System.out.println("Iterating");
		iterate(src, "");
	}

}
