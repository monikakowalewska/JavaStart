package pl.javastart.zadania;

public class Part {
protected int numerIdent;
protected String producent;
protected String model;
protected String seria;

public int getNumerIdent() {
	return numerIdent;
}
public void setNumerIdent(int numerIdent) {
	this.numerIdent = numerIdent;
}
public String getProducent() {
	return producent;
}
public void setProducent(String producent) {
	this.producent = producent;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getSeria() {
	return seria;
}
public void setSeria(String seria) {
	this.seria = seria;
}
public Part(){}
public Part(int numerIdent,String producent,String model,String seria){
	setNumerIdent(numerIdent);
	setProducent(producent);
	setModel(model);
	setSeria(seria);
}
public void print(){
	System.out.println("Czêœæ z hurtowni "+getNumerIdent()+" "+getProducent()+" "+getModel()+" "+getSeria());
}
}
