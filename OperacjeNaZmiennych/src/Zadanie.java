public class Zadanie {
    public static void main(String[] args) {
        int x=6;
        int y=8;
        System.out.println("Czy x jest wi�ksze od y?");
        System.out.println(x>y);
        System.out.println("Czy x pomno�one przez 2 jest wi�ksze od y?");
        System.out.println(x*2>y);
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2?");
        System.out.println(y<x+3&&y>x-2);
        System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacj� modulo)");
        System.out.println((x*y)%2==0);

//        Czy y jest mniejsze od sumy x+3 i jednocze�nie wi�ksze od x pomniejszonego o 2?
//                Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operacj� modulo)
    }
}
