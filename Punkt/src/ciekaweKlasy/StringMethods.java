package ciekaweKlasy;

public class StringMethods {
	public static void main(String[] args) {//stringa nie zmianiam tylko operuje na nim
		String words = "  Jeden dwa trzy cztery piêæ szeœæ siedem ";
		String sub1 = words.substring(2, 7);
		String sub2 = words.replaceAll("dwa", "hehe");
		String sub3 = words.trim();
		char charat = words.charAt(2);
		
		
		System.out.println(words);
		System.out.println("words.substring(2, 7)");
		System.out.println(sub1);
		System.out.println("words.replaceAll(\"dwa\", \"hehe\")");
		System.out.println(sub2);
		System.out.println("words.trim()");
		System.out.println(sub3);
		System.out.println("words.charAt(2)");
		System.out.println(charat);
		System.out.println(words);
		
		StringBuilder builder=new StringBuilder(words);//StringBuildera moge modyfikowaæ
		System.out.println(builder);
		builder.replace(2, 7, "gupek");
		System.out.println(builder);
	}

}
