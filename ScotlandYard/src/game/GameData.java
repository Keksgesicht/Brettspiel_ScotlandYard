package game;

/**
  * description
  * @version 1.0 from 09.01.2017
  * @author Jan Braun
  */

public abstract class GameData {
	private static int ROUNDS;
	private static int[] SIGHTS;
	private static Player[] PLAYERS;
	private static String MAP;
	private static Location[] LOCATIONS;

	public static int getROUNDS() {
		return ROUNDS;
	}

	public static int[] getSIGHTS() {
		return SIGHTS;
	}

	public static Player[] getPLAYERS() {
		return PLAYERS;
	}

	public static String getMAP() {
		return MAP;
	}

	public static void setROUNDS(int rounds) {
		ROUNDS = rounds;
	}

	public static void setSIGHTS(int[] sights) {
		SIGHTS = sights;
	}

	public static void setPLAYERS(Player[] players) {
		PLAYERS = players;
	}

	public static void setMAP(String map) {
		MAP = map;
	}

	public static Location[] getLOCATIONS() {
		return LOCATIONS;
	}

	public static void setLOCATIONS(Location[] locations) {
		LOCATIONS = locations;
	}
	
}
