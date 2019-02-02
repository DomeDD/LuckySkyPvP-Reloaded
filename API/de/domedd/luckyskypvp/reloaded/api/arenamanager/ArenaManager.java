package de.domedd.luckyskypvp.reloaded.api.arenamanager;

class ArenaManager {
	
	/**
	 * Call this method to get the world of an arena.
	 * 
	 * @param arena The name of an arena
	 * @return World The World of an arena
	 * 
	 */
	World getArenaWorld(String arena);
	
	/**
	 * Call this method to get the name of an arena.
	 * 
	 * @param p The player
	 * @return String The name of an arena
	 * 
	 */
	String getArenaName(Player player);
	
	/**
	 * Call this method to get whether an arena is joinable or not.
	 * 
	 * @param arena The name of an arena
	 * @return boolean True if the arena is joinable
	 * 
	 */
	boolean isArenaJoinable(String arena);
	
	/**
	 * Call this method to get whether an arena exists or not.
	 * 
	 * @param arena The name of an arena
	 * @return boolean True if the arena exists
	 * 
	 */
	boolean arenaExists(String arena);
	
	/**
	 * Call this method to get whether an arena is finished or not.
	 * 
	 * @param arena The name of an arena
	 * @return boolean True if the arena is finished
	 * 
	 */
	boolean arenaFinished(String arena);
	
	/**
	 * Call this method to get all players in an arena.
	 * 
	 * @param arena The name of an arena
	 * @return List<Player> List of all players inside an arena
	 * 
	 */
	List<Player> getArenaPlayers(String arena);
	
	/**
	 * Call this method to get the amount of players inside an arena.
	 * 
	 * @param arena The name of an arena
	 * @return int Amount of players inside an arena
	 * 
	 */
	int getArenaPlayerCount(String arena);
	
	/**
	 * Call this method to get the maximum amount of players of an arena.
	 * 
	 * @param arena The name of an arena
	 * @return int Amount of maximum players inside an arena
	 * 
	 */
	int getArenaMaxPlayers(String arena);
	
	/**
	 * Call this method to get whether a player is indise an arena or not.
	 * 
	 * @param player The player
	 * @return boolean True if the player is an arena
	 * 
	 */
	boolean isPlayerInAnArena(Player player);
}
