package Inheritance;
class An {
	void display() {
		System.out.println("This is an animal" );
	}
}
class Dog extends An{
}
public class Animal{
	public static void main(String[] args) {
		Dog d =new Dog();
		d.display();
	}
}



//class Dog {
//	public void display(){
//		System.out.println("This is an animal" );
//	}
//}
//  public class Animal extends Dog{
//	public static void main(String[] args) {
//	Dog d =new Dog();
//	d.display();
//	}
//	
//}