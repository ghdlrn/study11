package java_20240131_2;

public class Magazine extends Book {

private String publicationCycle;
	
	public Magazine() {	}
	public Magazine(String title, String author, String publishYear, String publicationCycle) {	
		super(title, author, publishYear);
		this.publicationCycle = publicationCycle;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("발행 주기 : " + publicationCycle);
	}
}
