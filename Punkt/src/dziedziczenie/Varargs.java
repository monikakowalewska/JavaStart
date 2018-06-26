package dziedziczenie;

public class Varargs {
	public static int suma(int arg0, int...args) {
		 
	    int wynik = arg0;
	 
	    for(int i=0; i<args.length; i++) {
	 
	        wynik += args[i];
	    }
	    return wynik;
	}
	
		public static void wypisz(int arg0, int...args) {
			 System.out.println("1 argument sta³y: " + arg0);
		 
		    for(int i=0; i<args.length; i++) {
		 
		        System.out.println(i+1 + " argument zmienny: " + args[i]);
		    }
		}
		
}
