package kwiecien18;

public class Test {
    public static void main(String[] args) {
        try {
            Foo.foo();
        } catch (Throwable e) {
            System.out.print("B");
        }
        System.out.println("C");
    }

}
