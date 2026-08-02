package Functional;

interface Animal2{
	void sound();
}

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Dog =()->{
			System.out.println("Dog makes Sound");
		};
   Dog.sound();
	}

}
