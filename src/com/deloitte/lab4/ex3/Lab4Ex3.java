package com.deloitte.lab4.ex3;

import java.util.Objects;

abstract class Item{
	
	private String uid;
	private String title;
	private int qty;
	
	public Item(String uid, String title, int qty) {
		super();
		this.uid = uid;
		this.title = title;
		this.qty = qty;
	}
	
	public void checkIn() {
		qty ++;
	}
	
	public void chceckOut() {
		qty --;
	}
	
	public abstract void print();
	
	@Override
	public String toString() {
		return "uid=" + uid + ", title=" + title+ ", qty=" + qty ;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(qty, title, uid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return qty == other.qty && Objects.equals(title, other.title) && Objects.equals(uid, other.uid);
	}
	
	
}

abstract class writtenItem extends Item{

	private String author;
	
	public writtenItem(String uid, String title, int qty, String author) {
		super(uid, title, qty);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "writtenItem [author=" + author + ", " + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		writtenItem other = (writtenItem) obj;
		return Objects.equals(author, other.author);
	}
}

class Book extends writtenItem{

	public Book(String uid, String title, int qty, String author) {
		super(uid, title, qty, author);
	}
	
    @Override
    public void print() {
        System.out.println("Book Details: " + toString());
    }
}

class JournalPaper extends writtenItem{
	
	private int yearPublished;
	
	public JournalPaper(String uid, String title, int qty, String author, int yearPublished) {
		
		super(uid, title, qty, author);
		this.yearPublished = yearPublished;
	}
	
	 public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	    public void print() {
	        System.out.println("Journal Paper Details: " + toString() + ", Year Published: " + yearPublished +"]");
	 }
}

abstract class mediaItem extends Item{

	private int runtime;
	
	public mediaItem(String uid, String title, int qty, int runtime) {
		super(uid, title, qty);
		this.runtime = runtime;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(runtime);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		mediaItem other = (mediaItem) obj;
		return runtime == other.runtime;
	}
	@Override
	public String toString() {
		return "mediaItem [runtime=" + runtime + " mins";
	}	
}

class Video extends mediaItem{
	
    private String director;
    private String genre;
    private int yearReleased;

    public Video(String uid, String name, int qty, int runtime, String director, String genre, int yearReleased) {
        super(uid, name, qty, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video Details: " + toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased+"]");
    }
}

class CD extends mediaItem{
	
	private String artist;
	private String genre;
	
	public CD(String uid, String title, int qty, int runtime, String artist, String genre) {
		super(uid, title, qty, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	 @Override
	    public void print() {
	        System.out.println("Video Details: " + toString() + ", Artist: " + artist + ", Genre: " + genre +"]");
	    }
}

public class Lab4Ex3 {
	
	public static void main(String[] args) {
		
		Item book = new Book("1", "Java", 4, "Abhi");
		Item journalPaper = new JournalPaper("1", "Java Research", 4, "Abhi", 2024);
		Item movie = new Video("3", "Java Learning", 10, 45, "Abhi", "Educations", 2024);
		Item cd = new CD("4", "Music", 20, 60, "Artist A", "Folk");
		
		 book.print();
		 journalPaper.print();
		 movie.print();
		 cd.print();
	}
}
