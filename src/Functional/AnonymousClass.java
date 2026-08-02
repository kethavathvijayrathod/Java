package Functional;
interface Animal1{
	void sound();
}

public class AnonymousClass {
 public static void main(String[] args) {
	Animal1 Dog = new Animal1() {
		public void sound() {
			System.out.println("Dog makes sound");
		}
	};
	Dog.sound();
}
}
