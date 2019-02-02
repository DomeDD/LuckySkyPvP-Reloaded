package de.domedd.luckyskypvp.reloaded.api;

class LuckySkyPvPAPI {
	
	/**
	 * Call this method to update the ingame scoreboard of a player.
	 * 
	 * @param p The player
	 * 
	 */
	void updateIngameScoreboard(Player p);
	
	/**
	 * Call this method to reset the ingame scoreboard of a player.
	 * 
	 * @param p The player
	 * 
	 */
	void resetIngameScoreboard(Player p);
	
	/**
	 * Call this method to update the lobby scoreboard of a player.
	 * Only available with Bukkit-Bungee version.
	 * 
	 * @param p The player
	 * 
	 */
	void updateLobbyScoreboard(Player p);
	
	/**
	 * Call this method to reset the lobby scoreboard of a player.
	 * Only available with Bukkit-Bungee version.
	 * 
	 * @param p The player
	 * 
	 */
	void resetLobbyScoreboard(Player p);
	
	/**
	 * Call this method to check wether in a world are too many entities on the ground or not.
	 * 
	 * @param world A world
	 * 
	 */
	boolean needsClearLag(World world);
	
	/**
	 * Call this method to remove all entities on the ground in a world.
	 * 
	 * @param world A world
	 * 
	 */
	void clearLag(World world);
	
	/**
	 * Call this method to open the arena selector.
	 * Only available with Bukkit-Bungee version.
	 * 
	 * @param p The player
	 * 
	 */
	void openArenaSelector(Player p);
	
	/**
	 * Call this method to open the FreeItemsInventory.
	 * 
	 * @param p The player
	 * @param item The ItemStack that is for free
	 * 
	 */
	void openFreeItemsInv(Player p, ItemStack item);
}
