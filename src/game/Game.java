package game;

import frames.MisterTravelTable;
import frames.PlayerMenu;

/**
 *
 * description
 *
 * @version 1.0 from 09.01.2017
 * @author 
 */

public abstract class Game {

	public static int cp;
	public static int r;
	public static boolean misterWin;
	public static PlayerMenu PM;
	public static MisterTravelTable MTT;

	public static boolean contains(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		} return false;
	}
  
	public static void run(int round){
		r = round;
		MTT = new MisterTravelTable("Scotland Yard - Fahrtentafel ohne Papier zum Einlegen");
		PM = new PlayerMenu("Scotland Yard - Spielfigur");
	}

}
