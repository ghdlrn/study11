package java_20240131_2;

public class Novel extends Book {
	
	private String genre;
	
	public Novel() {	}
	public Novel(String title, String author, String publishYear, String genre) {	
		super(title, author, publishYear);
		this.genre = genre;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("장르 : " + genre);
	}
}
