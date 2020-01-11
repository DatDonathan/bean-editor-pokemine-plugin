package at.jojokobi.pokemine.editor;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import at.jojokobi.beaneditor.serialization.EmptySerializerData;
import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.beaneditor.serialization.SerializationException;

public class PokemonYAMLSerializer implements ObjectSerializer<EmptySerializerData>{

	@Override
	public String getFileExtension() {
		return "yml";
	}

	@Override
	public Object deserialize(InputStream in, EmptySerializerData data) throws SerializationException {
		FileConfiguration config = new YamlConfiguration();
		try {
			config.load(new InputStreamReader(in));
		} catch (IOException | InvalidConfigurationException e) {
			throw new SerializationException(e);
		}
		return config.get("species");
	}

	@Override
	public void serialize(Object obj, OutputStream out, EmptySerializerData data) throws SerializationException {
		FileConfiguration config = new YamlConfiguration();
		config.set("species", obj);
		PrintWriter writer = new PrintWriter(out);
		writer.write(config.saveToString());
		writer.flush ();
	}

	@Override
	public Class<EmptySerializerData> getSerializationDataClass() {
		return EmptySerializerData.class;
	}

	@Override
	public String getName() {
		return "YAML Pokemon Species File";
	}

}
