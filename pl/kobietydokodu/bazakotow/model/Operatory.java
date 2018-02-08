package pl.kobietydokodu.bazakotow.model;

public class Operatory {
public static void main(String[] args){
	String ja = "Slawek";
	String ty = "Slawek";
	boolean porownanie1 = ja==ty;
	boolean porownanie2 = ja.equals(ty);
	System.out.println(porownanie1);
	System.out.println(porownanie2);
	
	int a = 5;
	int b = 3;
	boolean prawda = a>b; //prawda=true
	boolean falsz = a<b; //falsz=false
	boolean porownanie = a==b;//porownanie=false
	boolean koniunkcja = (a>b)&&(a!=b); //true prawda i prawda = prawda
	System.out.println(koniunkcja);
	
	double c=4.25;
	double d=5.48;
	double e=8.11;
	double dzialanie1=(c+d)*e;
	double dzialanie2=c-d/e;
	double dzialanie3=(c-d)/e;
	System.out.println(dzialanie1);
	System.out.println(dzialanie2);
	System.out.println(dzialanie3);
	
	c++;
	d--;
	e++;
	System.out.println(dzialanie1);
	System.out.println(dzialanie2);
	System.out.println(dzialanie3);
	boolean dzialanie4=(c+d)>e;
	boolean dzialanie5= c==d;
	System.out.println(dzialanie4);
	System.out.println("Czy c jest takie samo jak d?"+dzialanie5);
	boolean dzialanie6=c!=d;
	System.out.println("c jest ró¿ne od d =" +dzialanie6);
	
	
	
	
}
}
