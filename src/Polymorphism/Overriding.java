package Polymorphism;

class X{
	void play() {
		System.out.println("X is playing");
	}
	
	void sleep() {
		System.out.println("X is Sleeping");
	}
}
class Y extends X {
	@Override
	void play() {
		super.play();
		System.out.println("Y is playing");
	}
}

public class Overriding {
	public static void main(String [] args) {
		X x = new Y();
		x.play();
		x.sleep();
		
		System.out.println("------------------------");
		
		Y y = new Y();
		y.play();
		y.sleep();
	}

}
