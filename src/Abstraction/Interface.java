package Abstraction;

interface Student{
	int age = 22; //public static final varibale
	
	public abstract void branch(); //abstract method
	
	public static void study() {
		System.out.println("student is reading ");    //static method
	}
	
	default void sleep() {
		System.out.println("Student is sleeping");   // final method
	}
}

interface Marks{
	void score();
}

class Report implements Student,Marks{
	public void branch() {
		System.out.println("CSE AIML");
	}
	
	public void score() {
		System.out.println("passed");
	}
}
public class Interface {

	public static void main(String[] args) {
		
		Student.study();
		
		Student s = new Report();
		s.branch();
		s.sleep();
		System.out.println(s.age);
		
		Marks m = new Report();
		m.score();
		
		System.out.println("----------------------------");
		
		Report r =new Report();
		
		r.branch();
		r.score();
		r.sleep();
		System.out.println(r.age);
		
	}

}
