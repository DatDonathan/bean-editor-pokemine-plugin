package at.jojokobi.pokemine.editor;

import java.io.InputStream;
import java.io.OutputStream;

import at.jojokobi.beaneditor.serialization.EmptySerializerData;
import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.beaneditor.serialization.SerializationException;
import at.jojokobi.pokemine.pokemon.PokemonLoader;

public class PokemonXMLSerializer implements ObjectSerializer<EmptySerializerData> {

	@Override
	public String getFileExtension() {
		return "xml";
	}

	@Override
	public Object deserialize(InputStream in, EmptySerializerData data) throws SerializationException {
		return PokemonLoader.getInstance().load(in);
	}

	@Override
	public void serialize(Object obj, OutputStream out, EmptySerializerData data) throws SerializationException {
		throw new SerializationException("XML only supports deserialization since its deprecated");
	}

	@Override
	public Class<EmptySerializerData> getSerializationDataClass() {
		return EmptySerializerData.class;
	}

	@Override
	public String getName() {
		return "XML Pokemon Species File";
	}

	
	
}
