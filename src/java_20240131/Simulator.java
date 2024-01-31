package java_20240131;

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
		
		sound(new Bird());
		sound(new Dog());
		sound(new Cat());
	}
		
		static void sound(Animal animal) {
			animal.makeSound();
		
	}

}
