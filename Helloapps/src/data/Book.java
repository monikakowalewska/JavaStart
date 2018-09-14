package data;
import data.Publication;
public class Book extends Publication{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 223407835749243954L;
	// Pola
    private String author;
    private int releaseDate;
    private int pages;
    private String isbn;
    
   
 
    // settery i gettery

 
    public String getIsbn() {
        return isbn;
    }
 
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
 
 
    public int getPages() {
        return pages;
    }
 
    public void setPages(int pages) {
        this.pages = pages;
    }
 
    public int getReleaseDate() {
        return releaseDate;
    }
 
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    // Konstruktory
    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
		this.pages = pages;
		this.publisher = publisher;
		this.isbn = isbn;
	}
 
    public Book(Book book) {
        this(book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getPages(), book
                .getPublisher(), book.getIsbn());
    }
	public void printInfo() {
        String info = getTitle() + "; " + getAuthor() + "; " + getReleaseDate() + "; " + getPages()
                + "; " + getPublisher() + "; " + getIsbn();
        System.out.println(info);
    }

	@Override
	public String toString() {
		StringBuilder print = new StringBuilder(32);
		print.append(getTitle());
		print.append("; ");
		print.append(getAuthor());
		print.append("; ");
		print.append(getYear());
		print.append("; ");
		print.append(getPages());
		print.append("; ");
		print.append(getPublisher());
		print.append("; ");
		print.append(getIsbn());
		return print.toString();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + pages;
		result = prime * result + releaseDate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pages != other.pages)
			return false;
		if (releaseDate != other.releaseDate)
			return false;
		return true;
	}
	
	
}


