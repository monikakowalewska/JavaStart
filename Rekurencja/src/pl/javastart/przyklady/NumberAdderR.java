package pl.javastart.przyklady;

public class NumberAdderR {//rekurencja
	public static void main(String[] args) {
		NumberAdderR adder = new NumberAdderR();
		
		int number = adder.sum(4);
		System.out.println(number);
	}
	
	public int sum(int n) {//argument liczba ograniczaj�c� nasz zbi�r do zsumowania "z g�ry"
		if(n>1) {
			System.out.println(n + "+" + "sum(" + (n-1) + ")");//dodajemy liczb� n oraz wynik dzia�ania metody sum() z argumentem pomniejszonym o 1.
			return n + sum(n-1);
		} else {
			return n;
		}
	}

}
