package pl.javastart.przyklady;

public interface IncrementalPrinter<T> {
	public T doSomething(T t);//zwraca typ zgodny z parametrem interfejsu oraz przyjmuje argument tego samego typu
}
