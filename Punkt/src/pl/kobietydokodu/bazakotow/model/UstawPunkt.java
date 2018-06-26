package pl.kobietydokodu.bazakotow.model;

public class UstawPunkt {
	public static void main(String args[]){
	
	
	Punkt punkt = new Punkt();
	punkt.setWspX(10);
	punkt.setWspY(20);

	System.out.println("Wspó³rzêdne to: ("+ punkt.getWspX() + ", "+ punkt.getWspY() +")");
	}
}
