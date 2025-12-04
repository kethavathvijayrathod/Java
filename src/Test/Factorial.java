package Test;

public class Factorial {
	public void getfact(int no) {
		int fact=1;
		int num=no;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("fact of "+no+" is "+fact);
	}

	public static void main(String[] args) {
		new Factorial().getfact(3);
		new Factorial().getfact(4);

	} 
}
