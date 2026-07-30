package Abstraction;

abstract class Animal {
	abstract void sound();
	
	public Animal() {
		System.out.println("Abstract class can have constructor called when child obj is created");
	}
	
	public static void staticMethod() {
		System.out.println("Abstract class can have static method");
	}
	
	public final void finalMethod() {
		System.out.println("Abstract class can have final method");
	}
	
	public void eat() {
		System.out.println("Animal is Eating");
	}
	
	public void sleep() {
		System.out.println("Animal is Slepping");
	}
}

	
class Dog extends Animal{
	public  Dog() {
		System.out.println("Child Constructor");
	}
	
	void sound() {
		System.out.println("Dog Makes sound");
	}
	
	
	
	
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("Dog is sleeping");
	}
	
}


class Animal1{
	public static void main(String[] args) {
	  
		Animal.staticMethod(); 
		
		Animal a = new Dog();
		a.finalMethod();
		a.sound();
		a.eat();
		a.sleep();
		System.out.println("----------------------------------");
		
		Dog d = new Dog();
		d.sound();
		d.sleep();
		d.eat();
		d.finalMethod();
		d.staticMethod();
	

	}

}
