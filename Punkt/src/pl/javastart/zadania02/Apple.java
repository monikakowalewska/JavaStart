package pl.javastart.zadania02;

import pl.javastart.zadania.Fruit;

public class Apple extends Fruit{
private String odmiana;

public String getOdmiana() {
	return odmiana;
}
public void setOdmiana(String odmiana) {
	this.odmiana = odmiana;
}
public Apple(String odmiana){
	super();
	setOdmiana(odmiana);
}
public void printInfo(){
	super.printInfo();
	System.out.println("Jab³ko "+getOdmiana());
}
}
