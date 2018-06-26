package dziedziczenie;

public class DzialanieEmerytow {
	public static void main(String args[]){
		Dziadek dziadek1=new Dziadek ("dziadzio",65,"wêdkarstwo");
//		dziadek1.ILOSC_OCZU = 4;
//		Dziadek dziadek2=new Dziadek ("dziadzio",65,"wêdkarstwo");
//		Dziadek.ILOSC_OCZU = 5;
//		System.out.println(dziadek1.ILOSC_OCZU);
		dziadek1.biegnijDoSklepu();
		System.out.println(dziadek1.krzyczNaDzieci());
		dziadek1.print();
		
	}
}
