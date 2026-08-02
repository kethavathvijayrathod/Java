package anonymous;

class Animal{
	public void sound() {
		System.out.println("Animal makes sound ");
	}
}

//class Dog extends Animal{
//	public void sound() {
//		System.out.println("Dog barks");
//	}
//}

public class Ex1 {
	public static void main(String[] args) {
//		
//		Animal obj=new Dog();
//		obj.sound();
		
		Animal obj=new Animal(){
			@Override
			public void sound() {
				System.out.println("Dog barks");
			}
			
		};
		obj.sound();

	}

}
