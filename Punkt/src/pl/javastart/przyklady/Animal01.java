package pl.javastart.przyklady;

public class Animal01 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal01(String name) {
		setName(name);
	}
	
	public void giveSound() {
		System.out.println("Jestem zwierzêciem i nazywam siê " + getName());
	}

}
