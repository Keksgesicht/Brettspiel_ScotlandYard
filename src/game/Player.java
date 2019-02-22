package game;

/**
 *
 * description
 *
 * @version 1.0 from 06.01.2017
 * @author Jan Braun
 */

public class Player {

	private int taxiCards;
	private int busCards;
	private int undergroundCards;
	private int multiplicators;
	private int secretCards;
	private int currentPostion;
	
	public int getTaxiCards() {
		return taxiCards;
	}

	public void setTaxiCards(int taxiCards) {
		this.taxiCards = taxiCards;
	}

	public int getBusCards() {
		return busCards;
	}

	public void setBusCards(int busCards) {
		this.busCards = busCards;
	}

	public int getUndergroundCards() {
		return undergroundCards;
	}

	public void setUndergroundCards(int undergroundCards) {
		this.undergroundCards = undergroundCards;
	}

	public int getMultiplicators() {
		return multiplicators;
	}

	public void setMultiplicators(int multiplicators) {
		this.multiplicators = multiplicators;
	}

	public int getSecretCards() {
		return secretCards;
	}

	public void setSecretCards(int secretCards) {
		this.secretCards = secretCards;
	}

	public int getCurrentPostion() {
		return currentPostion;
	}

	public void moveTo(int nextPosition, boolean d) {
		if (d) {
			GameData.getLOCATIONS()[currentPostion].setIsSelectedByD(false);
			GameData.getLOCATIONS()[nextPosition].setIsSelectedByD(true);
		} currentPostion = nextPosition;
	}

}
