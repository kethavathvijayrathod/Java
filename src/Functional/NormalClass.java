package Functional;

@FunctionalInterface
interface Animal{
	void sound();
}
class Dog implements Animal{
	public void sound() {
		System.out.println("Dog makes Sound");
	}
}

public class NormalClass {
  public static void main(String[] args) {
	  Animal a = new Dog();
	  a.sound();
  }
}
