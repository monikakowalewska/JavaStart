package data;

import java.io.Serializable;

public class Publication implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1496036272058152254L;
	protected int year;
	protected String title;
	protected String publisher;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
