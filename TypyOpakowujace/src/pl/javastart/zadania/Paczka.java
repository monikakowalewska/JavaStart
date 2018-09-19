package pl.javastart.zadania;

import java.io.Serializable;



public class Paczka implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6014559535450184856L;
	String[]tab={"123","1234","12345","123456789123456789","987654321987654321"};
	public String[] getTab() {
		return tab;
	}

	public void setTab(String[] tab) {
		this.tab = tab;
	}
	public Paczka(){
		/*tab = new String[5]; w tym momencie zeruje tablice*/
		/*tab[0]="123";*/
	}
	
}
