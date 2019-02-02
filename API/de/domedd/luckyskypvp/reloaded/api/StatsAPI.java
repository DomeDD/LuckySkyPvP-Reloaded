package de.domedd.luckyskypvp.reloaded.api;

class StatsAPI {
	
	/**
	 * Call this method to get the kills of a player.
	 * 
	 * @param uuid The UUID of a player
	 * @return int Amount of kills
	 * 
	 */
	int getKills(UUID uuid);
	
	/**
	 * Call this method to get the deaths of a player.
	 * 
	 * @param uuid The UUID of a player
	 * @return int Amount of deaths
	 * 
	 */
	int getDeaths(UUID uuid);
	
	/**
	 * Call this method to get the K/D of a player.
	 * 
	 * @param uuid The UUID of a player
	 * @return double K/D
	 * 
	 */
	double getKD(UUID uuid);
}
