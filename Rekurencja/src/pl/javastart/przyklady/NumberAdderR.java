package pl.javastart.przyklady;

public class NumberAdderR {//rekurencja
	public static void main(String[] args) {
		NumberAdderR adder = new NumberAdderR();
		
		int number = adder.sum(4);
		System.out.println(number);
	}
	
	public int sum(int n) {//argument liczba ograniczaj¹c¹ nasz zbiór do zsumowania "z góry"
		if(n>1) {
			System.out.println(n + "+" + "sum(" + (n-1) + ")");//dodajemy liczbê n oraz wynik dzia³ania metody sum() z argumentem pomniejszonym o 1.
			return n + sum(n-1);
		} else {
			return n;
		}
	}

}
