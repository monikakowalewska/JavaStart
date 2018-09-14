package pl.javastart.przyklady;

public class NumberAdder {//sposób w pêtli bez rekurencji
	public static void main(String[] args) {
		NumberAdder adder = new NumberAdder();
		
		int number = adder.sum(3);//n=3
		System.out.println(number);
	}
	
	public int sum(int n) {//kolejno dodajemy cyfry zmniejszaj¹ce siê - od n do 0
		int sum = 0;
		while(n>0) {
			sum = sum + n;
			n--;
		}
		return sum;
	}

}
