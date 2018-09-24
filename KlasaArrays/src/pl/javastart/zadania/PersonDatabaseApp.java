package pl.javastart.zadania;



public class PersonDatabaseApp {
public static void main(String[] args) {
	PersonDatabase pd=new PersonDatabase();
	pd.add(new Person("d","r","45"));
	pd.add(new Person("d","r","45"));
	pd.add(new Person("Mo","L","65"));
	pd.add(new Person("d","r","45"));
	pd.add(new Person("fds","jkhkj","76876"));
	pd.add(new Person("kjbkj","asas","928"));
	pd.size();
	pd.toString();
	pd.get(2);
	pd.remove(new Person("Mo","L","65"));
	pd.get(1);
	pd.size();

}
}
