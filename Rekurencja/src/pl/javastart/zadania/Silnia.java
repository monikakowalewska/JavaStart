package pl.javastart.zadania;

public class Silnia {
public static void main(String[] args) {
	Silnia silnia=new Silnia();
	int number = silnia.multi(4);
	System.out.println(number);
}
	public int multi(int n){
	if(n>1) {
		System.out.println(n + "*" + "multi(" + (n-1) + ")");//mno¿ymy liczbê n i wynik dzia³ania metody multi() z argumentem pomniejszonym o 1.
		return n *multi(n-1);
	}else if (n==0){
		return 1;
	} 
	else if (n<0)
	{System.out.println("Ta liczba nie jest Naturalna");
		return 0;
	}
	else{
		return n;
	}
}
}

