package ciekaweKlasy;

public class StringsTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<100; i++) {
			builder.append(i);
			builder.append(" ");
		}
		String numbers = builder.toString();
		
		System.out.println(numbers);
	}

}
