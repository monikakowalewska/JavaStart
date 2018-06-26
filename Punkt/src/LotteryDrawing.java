import java.util.*;

/**
 * Niniejszy program demonstruje zastosowanie tablic.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryDrawing
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Ile liczb musisz wylosowa�? ");
      int k = in.nextInt();

      System.out.print("Jaka jest najwi�ksza liczba? ");
      int n = in.nextInt();

      // Zape�nienie tablicy liczbami 1 2 3 . . . n.
      int[] numbers = new int[n];
      for (int i = 0; i < numbers.length; i++)
         numbers[i] = i + 1;

      // Losowanie k liczb i zapisanie ich w drugiej tablicy.
      int[] result = new int[k];
      for (int i = 0; i < result.length; i++)
      {
         // Losowanie indeksu z zakresu 0 do n�1.
         int r = (int) (Math.random() * n);

         // Pobranie elementu z losowej lokalizacji.
         result[i] = numbers[r];

         // Przeniesienie ostatniego elementu do losowej lokalizacji.
         numbers[r] = numbers[n - 1];
         n--;
      }

      // Wydruk zapisanej tablicy.
      Arrays.sort(result);
      System.out.println("Postaw na nast�puj�ce liczby. Dzi�ki nim zdob�dziesz bogactwo!");
      for (int r : result)
         System.out.println(r);
   }
}