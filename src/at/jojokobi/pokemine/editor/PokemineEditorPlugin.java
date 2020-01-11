package at.jojokobi.pokemine.editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import at.jojokobi.beaneditor.plugins.ObjectEditorPlugin;
import at.jojokobi.beaneditor.serialization.ObjectSerializer;
import at.jojokobi.mcutil.JojokobiUtilPlugin;
import at.jojokobi.pokemine.PokeminePlugin;
import at.jojokobi.pokemine.battle.effects.DestinyBond;
import at.jojokobi.pokemine.battle.effects.Safeguard;
import at.jojokobi.pokemine.pokemon.status.Confusion;
import at.jojokobi.pokemine.pokemon.status.Cursed;
import at.jojokobi.pokemine.pokemon.status.Drowsiness;
import at.jojokobi.pokemine.pokemon.status.Flinched;
import at.jojokobi.pokemine.pokemon.status.LeechSeed;
import at.jojokobi.pokemine.pokemon.status.SwitchBlock;
import at.jojokobi.pokemine.pokemon.status.Wrapped;

public class PokemineEditorPlugin implements ObjectEditorPlugin {

	@Override
	public List<Class<?>> getSerializableClasses() {
		PokeminePlugin.registerSerializables();
		JojokobiUtilPlugin.registerSerializables();
		ArrayList<Class<?>> classes = new ArrayList<>();
		classes.addAll(PokeminePlugin.getConfigurationSerializables());
		classes.addAll(JojokobiUtilPlugin.getConfigurationSerializables());
		classes.add(ItemStack.class);
		classes.add(Confusion.class);
		classes.add(Cursed.class);
		classes.add(Drowsiness.class);
		classes.add(Flinched.class);
		classes.add(SwitchBlock.class);
		classes.add(Wrapped.class);
		classes.add(LeechSeed.class);

		classes.add(Safeguard.class);
		classes.add(DestinyBond.class);
		return classes;
	}

	@Override
	public List<ObjectSerializer<?>> getObjectSerializers() {
		return Arrays.asList(new MoveYAMLSerializer(), new PokemonYAMLSerializer(), new MoveXMLSerializer(),
				new PokemonXMLSerializer());
	}

	@Override
	public void init() {
		Bukkit.setServer(new FakeServer());
	}

	@Override
	public void enable() {
		System.out.println("Enabling");
//		new FileConverter<>(new File("./pokemon"), new File("./Fertig/Pokemon"), new PokemonXMLSerializer(), new EmptySerializerData(), new PokemonYAMLSerializer(), new EmptySerializerData()).convert();
//		new FileConverter<>(new File("./Fertig/moves"), new File("./Fertig/moves"), new MoveYAMLSerializer(), new EmptySerializerData(), new MoveYAMLSerializer(), new EmptySerializerData()).convert();
//		new FileIterator<>(new File("./Fertig/moves"), new MoveYAMLSerializer(), null).iterate();
		
//		new FileFuzer<EmptySerializerData>(new File("./Fertig/moves_new"), new File("./Fertig/moves_old"), new File("./Fertig/moves"), new MoveYAMLSerializer(), new EmptySerializerData()) {
//			@Override
//			public Object fuze(Object obj1, Object obj2) {
//				Move move = (Move) obj1;
//				move.setProcedure(((Move) obj2).getProcedure());
//				move.setPreExecuteProcedure(((Move) obj2).getPreExecuteProcedure());
//				move.setInitializeProcedure(((Move) obj2).getInitializeProcedure());
//				return move;
//			}
//		}.fuze();
		
		
	}

}
