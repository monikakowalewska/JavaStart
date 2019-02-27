package data;

import java.time.MonthDay;
import java.util.Objects;

public class Magazine extends Publication{
	public static final String TYPE = "Magazyn";
	private MonthDay monthDay;
	private String language;

	public MonthDay getMonthDay() {

        return monthDay;

    }

    public void setMonthDay(MonthDay monthDay) {

        this.monthDay = monthDay;

    }

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Magazine(String title, String publisher, String language, int year, int month, int day) {
		super(title, publisher,year);
		setLanguage(language);
		this.monthDay = MonthDay.of(month, day);
	}

	 @Override

	    public String toCsv() {

	        return (TYPE + ";") +

	                getTitle() + ";" +

	                getPublisher() + ";" +

	                getYear() + ";" +

	                monthDay.getMonthValue() + ";" +

	                monthDay.getDayOfMonth() + ";" +

	                language + "";

	    }

	

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), monthDay, language);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (monthDay == null) {
			if (other.monthDay != null)
				return false;
		} else if (!monthDay.equals(other.monthDay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + monthDay.getMonthValue() + ", " + monthDay.getDayOfMonth() + ", " + language;
	}

	

}
