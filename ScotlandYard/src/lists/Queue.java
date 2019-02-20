package lists;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15.12.2016
 * @author 
 */

public class Queue {

	private Element[] liste;
	private Element anfang;
	private Element ende;
	private int n;

	public void enqueue(Element neuE){ 
		if (isEmpty()) {
			anfang = neuE;
		} else {
			ende.setNaechstes(neuE);
		} ende = neuE;
		n++;
	}
	public void enqueue(String neuS){ 
		Element neuE = new Element();
		neuE.setInhaltString(neuS);
		enqueue(neuE);
	}
	public void enqueue(int neuI){ 
		Element neuE = new Element();
		neuE.setInhaltInt(neuI);
		enqueue(neuE);
	}
	
	public void dequeue(){
		if (!isEmpty()) {
			anfang = anfang.getNaechstes();
			n--;
		}
	}
	
	public Element peek(){
		if (!isEmpty()) {
			return anfang;
		} return null;
	}
	public String peekString(){
		if (!isEmpty()) {
			return peek().getInhaltString();
		} return null;
	}
	public int peekInt(){
		if (!isEmpty()) {
			return peek().getInhaltInt();
		} return -1;
	}
	
	public boolean isEmpty(){
		return (n==0);
	}
	
	public int length(){
		return n;
	}
	
	public Element[] gibListe() {
		liste = new Element[n];
		
		if (!isEmpty()) {
			for (int i=0; i<liste.length; i++) {
				liste[i] = peek();
				dequeue();
			} for (int i=0; i<liste.length; i++) {
				enqueue(liste[i]);
			}
		} return liste;
	} 
	public String[] gibListeStrings() {
		liste = gibListe();
		String[] strings = new String[n];
		
		for (int i=0; i<liste.length; i++) {
			strings[i] = liste[i].getInhaltString();
		} return strings;
	} 
	public int[] gibListeInts() {
		liste = gibListe();
		int[] ints = new int[n];
		
		for (int i=0; i<liste.length; i++) {
			ints[i] = liste[i].getInhaltInt();
		} return ints;
	} 
	
}
