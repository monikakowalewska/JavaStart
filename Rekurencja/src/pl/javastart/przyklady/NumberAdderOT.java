package pl.javastart.przyklady;

public class NumberAdderOT {//operator trójargumentowy
	public static void main(String[] args) {
		NumberAdderOT adder = new NumberAdderOT();
		
		int number = adder.sum(4);
		System.out.println(number);
	}
	
	public int sum(int n) {
		System.out.println(n + "+" + "sum(" + (n-1) + ")");
		return n>1? n + sum(n-1) : n;
	}

}
