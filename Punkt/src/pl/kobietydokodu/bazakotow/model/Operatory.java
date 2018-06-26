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
	
	/*int x = 5;
    int y = 10;
    System.out.print("Czy X jest wiêkszy od Y? ");
    System.out.println(x > y);
     
    System.out.print("Czy X jest ró¿ny od Y? ");
    System.out.println(x != y);
     
    boolean instance = "Kasia" instanceof java.lang.String;
    System.out.println(instance); //"Kasia" jest typu String
*/    
    int x = 5;
    int y = 10;
    boolean logic = true;
     
    System.out.print("x<10 && y<11? ");
    System.out.println(x<10 && y<11);
     
    System.out.print("x<10 && y<10? ");
    System.out.println(x<10 && y<10);
     
    System.out.print("x<10 || y<10? ");
    System.out.println(x<10 || y<10);
     
    System.out.print(logic);
    System.out.print(" , !logic = ");
    System.out.println(!logic);
     
    System.out.print("Warunek z³o¿ony !(x<10 && y<10) ");
    System.out.println(!(x<10 && y<10));
    
    char letter1 = 'k';
    char letter2 = 'o';
    char letter3 = 't';
    System.out.println("B³êdne \"sumowanie\" znaków");
    System.out.println(letter1 + letter2 + letter3);
    System.out.println("Tekst jawny");
    System.out.println("" + letter1 + letter2 + letter3);
    letter1++;
    letter2++;
    letter3++;
    System.out.println("Tekst zaszyfrowany");
    System.out.println("" + letter1 + letter2 + letter3);
	
	
	
	
}
}
