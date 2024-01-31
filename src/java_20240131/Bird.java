package java_20240131;

public class Bird extends Animal {
	
	public Bird() {	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("짹짹");
	}
}
