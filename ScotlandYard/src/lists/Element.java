package lists;

public class Element {

	private Element naechstes;
	private Element vorheriges;
	private String inhaltString;
	private int inhaltInt;
	
	public Element() {
	}
	
	public Element getNaechstes() {
		return naechstes;
	}

	public void setNaechstes(Element naechstes) {
		this.naechstes = naechstes;
	}

	public Element getVorheriges() {
		return vorheriges;
	}

	public void setVorheriges(Element vorheriges) {
		this.vorheriges = vorheriges;
	}
	
	public String getInhaltString() {
		return inhaltString;
	}

	public void setInhaltString(String inhaltString) {
		this.inhaltString = inhaltString;
	}

	public int getInhaltInt() {
		return inhaltInt;
	}

	public void setInhaltInt(int inhaltInt) {
		this.inhaltInt = inhaltInt;
	}

}
