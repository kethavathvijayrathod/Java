package Test;

public class prime2 {
	public static void main(String[] args) {
		int prime=0;
		for(int num=1;num<=100;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				prime++;
				System.out.println(num);
			}	}
		System.out.println("total prime :"+prime);
	}
}