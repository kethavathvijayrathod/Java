package Test;
// Duck no: if a number has a 0 except at the starting position ex:1204.102,1502
import java.util.Scanner;
public class DuckNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check whether it is Duck Number or Not :");
		int num=sc.nextInt();
		int temp=num;
		boolean hasZero=false;
		if(temp==0) {
			System.out.println(num+":is not a Duck number");
			sc.close();
			return;
		}
		while(temp>0) {
			int digit=temp%10;
			if(digit==0) {
				hasZero=true;
				break;
			}
			temp/=10;
		}
		if(hasZero) {
			System.out.println(num+":is a Duck number");
		}
		else {
			System.out.println(num+":is not a Duck number");
		}
		sc.close();
	}
}




//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a number to check whether it is Duck Number or Not :");
//		String num=sc.next();
//		if(num.charAt(0)=='0') {
//			System.out.println(num+":is not a Duck number");
//		}
//		else if(num.contains("0")) {
//			System.out.println(num+":is a Duck number");
//		}
//		else{
//			System.out.println(num+":is not a Duck number");
//		}
//		sc.close();
//
//	}
//
//}
