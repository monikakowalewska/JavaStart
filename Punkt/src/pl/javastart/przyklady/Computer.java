package pl.javastart.przyklady;

public class Computer {
	String processor;
    int memory;
     //konstruktor
    Computer(String proc, int mem) {
        processor = proc;
        memory = mem;
    }
    void printInfo() {
        System.out.println(processor + " " + memory);
    }
}
