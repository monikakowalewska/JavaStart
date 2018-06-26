package pl.javastart.przyklady;

public class Company {
	public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Marta", "Ziêba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);
        employees[3] = new Employee("Patrycja", "Nowak", 2600);
        employees[4] = new Employee("Wojciech", "Marczak", 3100);
        
        int employeeIndex = 2;
        System.out.println(employees[employeeIndex-1].getFirstName()+" "+
                employees[employeeIndex-1].getLastName()+": "+
                employees[employeeIndex-1].getSalary()+"z³");
        int employeesSize = employees.length;
		System.out.println("Wielkoœæ tablicy: "+employeesSize);
		System.out.println("Ostatni element tablicy to: " + employees[employeesSize-1]);

    }

}
