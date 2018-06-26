package pl.javastart.przyklady;

public enum Size {
SMALL("Ma³y"), MEDIUM("Œredni"), LARGE("Du¿y");
	
	private String description;
	Size(String desc) {
		description = desc;
	}
	
	public String getDescription() {
		return description;
	}


}
