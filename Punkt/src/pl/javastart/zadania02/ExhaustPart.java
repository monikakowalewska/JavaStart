package pl.javastart.zadania02;

import pl.javastart.zadania.Part;

public class ExhaustPart extends Part{//cz�sci uk�adu wydechowego
private String emissionStandard;

public String getEmissionStandard() {
	return emissionStandard;
}

public void setEmissionStandard(String emissionStandard) {
	this.emissionStandard = emissionStandard;
}	
public ExhaustPart(){}
public ExhaustPart(String model,int numerId, String producent,String seria,String emissionStandard){
	setModel(model);
	setNumerIdent(numerId);
	setProducent(producent);
	setSeria(seria);
	setEmissionStandard(emissionStandard);
}
public void print(){
	System.out.println("Cz�� uk�adu wydalniczego "+getNumerIdent()+" "+getModel()+" "+getProducent()+" "+getSeria()+" "+getEmissionStandard());
}
}