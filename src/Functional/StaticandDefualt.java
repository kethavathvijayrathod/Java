package Functional;
interface Calculate{
	int add(int a,int b);

	default void msg() {
		System.out.println("this is default method");
	}
	static void print() {
		System.out.println("this is static method");
	}
}

public class StaticandDefualt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculate cal = (a,b)->{
        	return (a+b); 
        	};
        
        System.out.println("sum"+cal.add(10, 0));
        
        cal.msg();
        Calculate.print();
        
	}

}
