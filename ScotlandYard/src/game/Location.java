package game;
/**
 *
 * description
 *
 * @version 1.0 from 08.01.2017
 * @author Jan Braun
 */

public class Location {

	private int[] busConnections;
	private int[] taxiConnections;
	private int[] undergroundConnections;
	private int[] secretConnections;
	private boolean isSelectedByD;

	public Location(){
		busConnections = new int[0];
		taxiConnections = new int[0];
		undergroundConnections = new int[0];
		secretConnections = new int[0];
	}
  
	public int[] getBusConnections() {
		return busConnections;
	}

	public void setBusConnections(int[] busConnections) {
		this.busConnections = busConnections;
	}

	public int[] getTaxiConnections() {
		return taxiConnections;
	}

	public void setTaxiConnections(int[] taxiConnections) {
		this.taxiConnections = taxiConnections;
	}

	public int[] getUndergroundConnections() {
		return undergroundConnections;
	}
	
	public void setUndergroundConnections(int[] undergroundConnections) {
		this.undergroundConnections = undergroundConnections;
	}

	public int[] getSecretConnections() {
		return secretConnections;
	}

	public void setSecretConnections(int[] secretConnections) {
		this.secretConnections = secretConnections;
	}

	public boolean getIsSelectedByD() {
		return isSelectedByD;
	}

	public void setIsSelectedByD(boolean isSelectedByD) {
		this.isSelectedByD = isSelectedByD;
	}

}
