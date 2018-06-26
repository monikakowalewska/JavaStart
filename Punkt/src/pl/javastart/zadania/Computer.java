package pl.javastart.zadania;

public class Computer {
private String producer;
private int model;
public String getProducer() {
	return producer;
}
public void setProducer(String producer) {
	this.producer = producer;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public Computer(){}
public Computer(String producer,int model){
	setProducer(producer);
	setModel(model);
}


@Override
public boolean equals(Object obj) {
    // sprawdzenie równoœci fizycznej za pomoc¹ ==
    if (this == obj)
        return true;
    // sprawdzamy, czy nie null
    if (obj == null)
        return false;

    // sprawdzamy, czy przekazany argument jest typu Student
    if (!(obj instanceof Computer))
        return false;
    //rzutowanie na odpowiedni typ
    Computer c = (Computer) obj;
     
    // sprawdzenie kolejnych pól klasy, uwa¿aj¹c na wartoœci null
    if(this.producer == c.producer && this.model == c.model)
        return true;
    if(this.producer != null) {
        if(!this.producer.equals(c.producer))
            return false;
    } else if(this.producer == null && c.producer != null)
        return false;
    if (this.model != 0) {
        if(this.model!=c.model)
            return false;
    } else if(this.model == 0 && c.model != 0)
        return false;
    //jeœli dojdziemy do tego miejsca to obiekty s¹ równe
    return true;
  /*  if(producer != null)
		if(producer.equals(comp.getProducer()) && comp.getModel() == this.model)
			return true;
	return false;*/

}

@Override
public String toString(){
	return producer+" "+model;
}
}
