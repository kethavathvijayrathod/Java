package Test;
// a Number whose square ends with same digits of as the number of its self ex:5^2=25,6^2=36,25^=625 
import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number to check whether it is a Automorphic number or Not:");
		int num=sc.nextInt();
		int temp=num;
		int square=num*num;
		while(temp>0) {
			if(temp%10!=square%10) {
				System.out.println(num+": is not a Automorphic Number");
				sc.close();
				return;
			}
			temp/=10;
			square/=10;
		} 
		System.out.println(num+": is  a Automorphic Number");
		sc.close();
	}

}
