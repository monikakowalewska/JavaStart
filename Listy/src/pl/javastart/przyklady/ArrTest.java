package pl.javastart.przyklady;

import java.util.Arrays;
import java.util.List;

public class ArrTest {//przekszta�cania tablicy na list� 
	public static void main(String[] args) {
        Integer[] ints = {5, 10, 15};
        List<Integer> lista = Arrays.asList(ints);
        for (Integer num : lista) {
            System.out.println(num);
           /* w java 9 - takie rozwi�zanie
            * List<Integer> numbers = List.of(5, 10, 15);
            for (Integer num : numbers) {
                System.out.println(num);*/

        }
    }
}
