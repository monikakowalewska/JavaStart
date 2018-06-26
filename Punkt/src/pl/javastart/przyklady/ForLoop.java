package pl.javastart.przyklady;

public class ForLoop {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		//uzupe³niamy tablicê
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		//wyœwietlamy tablicê
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Liczba: " + numbers[i]);
		}
	}

}
