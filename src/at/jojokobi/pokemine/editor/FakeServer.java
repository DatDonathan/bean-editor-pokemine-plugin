package at.jojokobi.pokemine.editor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.logging.Logger;

import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.GameMode;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.StructureType;
import org.bukkit.Tag;
import org.bukkit.UnsafeValues;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.boss.KeyedBossBar;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.craftbukkit.v1_15_R1.inventory.CraftItemFactory;
import org.bukkit.craftbukkit.v1_15_R1.util.CraftMagicNumbers;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.Recipe;
import org.bukkit.loot.LootTable;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;

@SuppressWarnings("deprecation")
public class FakeServer implements Server {

	private Logger logger = Logger.getGlobal();
	
	@Override
	public Set<String> getListeningPluginChannels() {
		
		return null;
	}

	@Override
	public void sendPluginMessage(Plugin arg0, String arg1, byte[] arg2) {
		
		
	}

	@Override
	public boolean addRecipe(Recipe arg0) {
		
		return false;
	}

	@Override
	public Iterator<Advancement> advancementIterator() {
		
		return null;
	}

	@Override
	public void banIP(String arg0) {
		
		
	}

	@Override
	public int broadcast(String arg0, String arg1) {
		
		return 0;
	}

	@Override
	public int broadcastMessage(String arg0) {
		
		return 0;
	}

	@Override
	public void clearRecipes() {
		
		
	}

	@Override
	public BlockData createBlockData(Material arg0) {
		
		return null;
	}

	@Override
	public BlockData createBlockData(String arg0) throws IllegalArgumentException {
		
		return null;
	}

	@Override
	public BlockData createBlockData(Material arg0, Consumer<BlockData> arg1) {
		
		return null;
	}

	@Override
	public BlockData createBlockData(Material arg0, String arg1) throws IllegalArgumentException {
		
		return null;
	}

	@Override
	public BossBar createBossBar(String arg0, BarColor arg1, BarStyle arg2, BarFlag... arg3) {
		
		return null;
	}

	@Override
	public KeyedBossBar createBossBar(NamespacedKey arg0, String arg1, BarColor arg2, BarStyle arg3, BarFlag... arg4) {
		
		return null;
	}

	@Override
	public ChunkData createChunkData(World arg0) {
		
		return null;
	}

	@Override
	public ItemStack createExplorerMap(World arg0, Location arg1, StructureType arg2) {
		
		return null;
	}

	@Override
	public ItemStack createExplorerMap(World arg0, Location arg1, StructureType arg2, int arg3, boolean arg4) {
		
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, InventoryType arg1) {
		
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, int arg1) throws IllegalArgumentException {
		
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, InventoryType arg1, String arg2) {
		
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder arg0, int arg1, String arg2) throws IllegalArgumentException {
		
		return null;
	}

	@Override
	public MapView createMap(World arg0) {
		
		return null;
	}

	@Override
	public Merchant createMerchant(String arg0) {
		
		return null;
	}

	@Override
	public World createWorld(WorldCreator arg0) {
		
		return null;
	}

	@Override
	public boolean dispatchCommand(CommandSender arg0, String arg1) throws CommandException {
		
		return false;
	}

	@Override
	public Advancement getAdvancement(NamespacedKey arg0) {
		
		return null;
	}

	@Override
	public boolean getAllowEnd() {
		
		return false;
	}

	@Override
	public boolean getAllowFlight() {
		
		return false;
	}

	@Override
	public boolean getAllowNether() {
		
		return false;
	}

	@Override
	public int getAmbientSpawnLimit() {
		
		return 0;
	}

	@Override
	public int getAnimalSpawnLimit() {
		
		return 0;
	}

	@Override
	public BanList getBanList(Type arg0) {
		
		return null;
	}

	@Override
	public Set<OfflinePlayer> getBannedPlayers() {
		
		return null;
	}

	@Override
	public KeyedBossBar getBossBar(NamespacedKey arg0) {
		
		return null;
	}

	@Override
	public Iterator<KeyedBossBar> getBossBars() {
		
		return null;
	}

	@Override
	public String getBukkitVersion() {
		
		return null;
	}

	@Override
	public Map<String, String[]> getCommandAliases() {
		
		return null;
	}

	@Override
	public long getConnectionThrottle() {
		
		return 0;
	}

	@Override
	public ConsoleCommandSender getConsoleSender() {
		
		return null;
	}

	@Override
	public GameMode getDefaultGameMode() {
		
		return null;
	}

	@Override
	public Entity getEntity(UUID arg0) {
		
		return null;
	}

	@Override
	public boolean getGenerateStructures() {
		
		return false;
	}

	@Override
	public HelpMap getHelpMap() {
		
		return null;
	}

	@Override
	public Set<String> getIPBans() {
		
		return null;
	}

	@Override
	public int getIdleTimeout() {
		
		return 0;
	}

	@Override
	public String getIp() {
		
		return null;
	}

	@Override
	public ItemFactory getItemFactory() {
		return CraftItemFactory.instance();
	}

	@Override
	public Logger getLogger() {
		return logger;
	}

	@Override
	public LootTable getLootTable(NamespacedKey arg0) {
		
		return null;
	}

	@Override
	public MapView getMap(int arg0) {
		
		return null;
	}

	@Override
	public int getMaxPlayers() {
		
		return 0;
	}

	@Override
	public Messenger getMessenger() {
		
		return null;
	}

	@Override
	public int getMonsterSpawnLimit() {
		
		return 0;
	}

	@Override
	public String getMotd() {
		
		return null;
	}

	@Override
	public String getName() {
		
		return null;
	}

	@Override
	public OfflinePlayer getOfflinePlayer(String arg0) {
		
		return null;
	}

	@Override
	public OfflinePlayer getOfflinePlayer(UUID arg0) {
		
		return null;
	}

	@Override
	public OfflinePlayer[] getOfflinePlayers() {
		
		return null;
	}

	@Override
	public boolean getOnlineMode() {
		
		return false;
	}

	@Override
	public Collection<? extends Player> getOnlinePlayers() {
		
		return null;
	}

	@Override
	public Set<OfflinePlayer> getOperators() {
		
		return null;
	}

	@Override
	public Player getPlayer(String arg0) {
		
		return null;
	}

	@Override
	public Player getPlayer(UUID arg0) {
		
		return null;
	}

	@Override
	public Player getPlayerExact(String arg0) {
		
		return null;
	}

	@Override
	public PluginCommand getPluginCommand(String arg0) {
		
		return null;
	}

	@Override
	public PluginManager getPluginManager() {
		
		return null;
	}

	@Override
	public int getPort() {
		
		return 0;
	}

	@Override
	public List<Recipe> getRecipesFor(ItemStack arg0) {
		
		return null;
	}

	@Override
	public BukkitScheduler getScheduler() {
		
		return null;
	}

	@Override
	public ScoreboardManager getScoreboardManager() {
		
		return null;
	}

	@Override
	public CachedServerIcon getServerIcon() {
		
		return null;
	}

	@Override
	public ServicesManager getServicesManager() {
		
		return null;
	}

	@Override
	public String getShutdownMessage() {
		
		return null;
	}

	@Override
	public int getSpawnRadius() {
		
		return 0;
	}

	@Override
	public <T extends Keyed> Tag<T> getTag(String arg0, NamespacedKey arg1, Class<T> arg2) {
		
		return null;
	}

	@Override
	public <T extends Keyed> Iterable<Tag<T>> getTags(String arg0, Class<T> arg1) {
		
		return null;
	}

	@Override
	public int getTicksPerAnimalSpawns() {
		
		return 0;
	}

	@Override
	public int getTicksPerMonsterSpawns() {
		
		return 0;
	}

	@Override
	@Deprecated
	public UnsafeValues getUnsafe() {
		return CraftMagicNumbers.INSTANCE;
	}

	@Override
	public String getUpdateFolder() {
		
		return null;
	}

	@Override
	public File getUpdateFolderFile() {
		
		return null;
	}

	@Override
	public String getVersion() {
		
		return null;
	}

	@Override
	public int getViewDistance() {
		
		return 0;
	}

	@Override
	public WarningState getWarningState() {
		
		return null;
	}

	@Override
	public int getWaterAnimalSpawnLimit() {
		
		return 0;
	}

	@Override
	public Set<OfflinePlayer> getWhitelistedPlayers() {
		
		return null;
	}

	@Override
	public World getWorld(String arg0) {
		
		return null;
	}

	@Override
	public World getWorld(UUID arg0) {
		
		return null;
	}

	@Override
	public File getWorldContainer() {
		
		return null;
	}

	@Override
	public String getWorldType() {
		
		return null;
	}

	@Override
	public List<World> getWorlds() {
		
		return null;
	}

	@Override
	public boolean hasWhitelist() {
		
		return false;
	}

	@Override
	public boolean isHardcore() {
		
		return false;
	}

	@Override
	public boolean isPrimaryThread() {
		
		return false;
	}

	@Override
	public CachedServerIcon loadServerIcon(File arg0) throws IllegalArgumentException, Exception {
		
		return null;
	}

	@Override
	public CachedServerIcon loadServerIcon(BufferedImage arg0) throws IllegalArgumentException, Exception {
		
		return null;
	}

	@Override
	public List<Player> matchPlayer(String arg0) {
		
		return null;
	}

	@Override
	public Iterator<Recipe> recipeIterator() {
		
		return null;
	}

	@Override
	public void reload() {
		
		
	}

	@Override
	public void reloadData() {
		
		
	}

	@Override
	public void reloadWhitelist() {
		
		
	}

	@Override
	public boolean removeBossBar(NamespacedKey arg0) {
		
		return false;
	}

	@Override
	public void resetRecipes() {
		
		
	}

	@Override
	public void savePlayers() {
		
		
	}

	@Override
	public List<Entity> selectEntities(CommandSender arg0, String arg1) throws IllegalArgumentException {
		
		return null;
	}

	@Override
	public void setDefaultGameMode(GameMode arg0) {
		
		
	}

	@Override
	public void setIdleTimeout(int arg0) {
		
		
	}

	@Override
	public void setSpawnRadius(int arg0) {
		
		
	}

	@Override
	public void setWhitelist(boolean arg0) {
		
		
	}

	@Override
	public void shutdown() {
		
		
	}

	@Override
	public Spigot spigot() {
		
		return null;
	}

	@Override
	public void unbanIP(String arg0) {
		
		
	}

	@Override
	public boolean unloadWorld(String arg0, boolean arg1) {
		
		return false;
	}

	@Override
	public boolean unloadWorld(World arg0, boolean arg1) {
		
		return false;
	}

	
	
}
