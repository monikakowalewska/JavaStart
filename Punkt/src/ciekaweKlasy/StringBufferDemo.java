package ciekaweKlasy;

public class StringBufferDemo {
	public static void main (String args[]){
		StringBuffer sb=new StringBuffer("jeden, dwa, jeden, trzy");
		System.out.println("bufor= "+sb);
		System.out.println("d�ugo��= "+sb.length());
		System.out.println("pojemno��= "+sb.capacity());
		System.out.println("charAt(7) przed= "+sb.charAt(7));
		sb.setCharAt(7, 'k');
		sb.setLength(21);
		System.out.println("bufor po skr�ceniu d�ugo�ci = "+sb);
		System.out.println("charAt(7) po = "+sb.charAt(7));
		sb.insert(12, "cztery, ");
		System.out.println(sb);
		System.out.println("pojemno��= "+sb.capacity());
		sb.delete(7, 10);
		System.out.println("po delete: "+sb);
		sb.deleteCharAt(7);
		System.out.println("po deleteCharAt: "+sb);
		sb.replace(10, 14, "woro");
		System.out.println("po replace: "+sb);
		int i;
		i=sb.indexOf("jeden");
		System.out.println("Index pierwszego wyst�pienia: "+i);
		i=sb.lastIndexOf("jeden");
		System.out.println("Index ostatniego wyst�pienia: "+i);
		
		
		sb.reverse();
		System.out.println(sb);
		
}
	}
