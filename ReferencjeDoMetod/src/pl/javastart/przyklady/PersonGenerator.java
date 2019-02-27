package pl.javastart.przyklady;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class PersonGenerator {// wype³nienie listy 5 razy Jan Kowalski
	 public static void main(String[] args) {
	        List<Person1> people = generate(5, "Jan", "Kowalski", Person1::new);
	        System.out.println(people);
	    }
	    
	    public static <T, U, V> List<V> generate(int size, T t, U u, BiFunction<T, U, V> biFunction) {
	        List<V> list = new ArrayList<>();
	        for (int i = 0; i < size; i++) {
	            list.add(biFunction.apply(t, u));
	        }
	        return list;
	    }
}
