package at.jojokobi.pokemine.editor;

import java.io.InputStream;
import java.io.OutputStream;

import at.jojokobi.beaneditor.serialization.EmptySerializerData;
import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.beaneditor.serialization.SerializationException;
import at.jojokobi.pokemine.moves.MoveLoader;

public class MoveXMLSerializer implements ObjectSerializer<EmptySerializerData> {

	@Override
	public String getFileExtension() {
		return "xml";
	}

	@Override
	public Object deserialize(InputStream in, EmptySerializerData data) throws SerializationException {
		return MoveLoader.getInstance().load(in, true);
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
		return "XML Move File";
	}

	
	
}
