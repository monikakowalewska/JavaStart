package pl.javastart.przyklady;

public enum Size {
SMALL("Ma�y"), MEDIUM("�redni"), LARGE("Du�y");
	
	private String description;
	Size(String desc) {
		description = desc;
	}
	
	public String getDescription() {
		return description;
	}


}
