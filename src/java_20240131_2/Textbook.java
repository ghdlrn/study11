package java_20240131_2;

public class Textbook extends Book {

private String academicField;
	
	public Textbook() {	}
	public Textbook(String title, String author, String publishYear, String academicField) {	
		super(title, author, publishYear);
		this.academicField = academicField;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("학문 분야 : " + academicField);
	}
}
