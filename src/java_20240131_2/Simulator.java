package java_20240131_2;

public class Simulator {

	public static void main(String[] args) {
		/* -> 다형성을 만족하지 않는다.
		Bird B = new Bird();
		Cat C = new Cat();
		Dog D = new Dog();
		
		B.makeSound();
		C.makeSound();
		D.makeSound();
		*/
		
		getDetails(new Novel("11", "22", "33", "44"));
		System.out.println("-----------------------------------");
		getDetails(new Magazine("55", "66", "77", "88"));
		System.out.println("-----------------------------------");
		getDetails(new Textbook("15", "26", "37", "48"));
	}
		
		static void getDetails(Book book) {
			book.getDetails();
		
	}

}
