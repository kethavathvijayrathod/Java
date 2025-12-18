package Test;

public class HarshedNo {
	public void getnum(int no) {
		int temp=no;
		int sum=0;
		while(temp!=0) {
			int digit=temp%10;
			sum=sum+digit;
			temp/=10;
		}
		System.out.println(no%sum==0?"HarshedNo":"!HarshedNo");
	}

	public static void main(String[] args) {
		new HarshedNo().getnum(18);

	}

}
