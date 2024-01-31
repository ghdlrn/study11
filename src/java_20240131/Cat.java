package java_20240131;

public class Cat extends Animal {

		public Cat() {	}
		
		@Override
		public void makeSound() {
			super.makeSound();
			System.out.println("야옹");
		}
}