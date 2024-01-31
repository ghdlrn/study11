package java_20240131;

public class Dog extends Animal {

		public Dog() {	}
		
		@Override
		public void makeSound() {
			super.makeSound();
			System.out.println("멍멍");
		}
}
