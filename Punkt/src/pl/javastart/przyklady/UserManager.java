package pl.javastart.przyklady;

public class UserManager {
	public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");
         
        System.out.println("Wybierz opcjê:");
        System.out.println("0 - wyjœcie z programu");
        System.out.println("1 - wyœwietl informacje o u¿ytkowniku");
        System.out.println("2 - modyfikuj dane u¿ytkownika");
         
        int option = 1;
         
        if(option == 0) {
            System.out.println("Bye bye!");
        } else if(option == 1) {
            System.out.println("U¿ytkownik: "+user.getFirstName()+" "+user.getLastName());
        } else if(option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono dane u¿ytkownika na: "+user.getFirstName()+" "+user.getLastName());
        }
    }

}
