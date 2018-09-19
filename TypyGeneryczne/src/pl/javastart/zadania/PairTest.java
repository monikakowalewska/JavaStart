package pl.javastart.zadania;

public class PairTest {

public <T,V>void print(Pair<T, V>pair) {
	// TODO Auto-generated method stub
	pair.printObjectT();pair.printObjectV();
}
	/*mo¿na i tak*/
	static <T, V> void printPair(Pair<T, V> pair) {
		System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
	}


public static void main(String[] args) {
	Pair<String,Integer> pair1 = new Pair<String,Integer>("apple",100);
	Pair<String,Double> pair2 = new Pair<String,Double>("peach",200.0);
	Pair<Integer,String> pair3 = new Pair<>(300,"pear");//operator diamentowy (nie trzba umieszczaæ typów w nawiasie ostrym, od Java7
	
	//test printObjectT();
	pair1.printObjectT();
	//obiekt klasy PairTest ¿eby wywolaæ metodê
	PairTest gm = new PairTest();
	gm.print(pair1);//dochodzi do autoboxingu i zamiany na typ obiektowy
	gm.print(pair2);
	gm.print(pair3);
	System.out.println("Próba z metod¹ statyczna printPair()");
	printPair(pair2);//metoda statyczna wiêc nie potrzeba referencji do obiektu
	printPair(pair2);
	
}
}
