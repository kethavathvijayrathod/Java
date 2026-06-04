package Test;

public class Reverse {
	public void getno(int no) {
		int num=no;
		int rev=0;
		while(num!=0) {
			int reminder=num%10;//1  2   7
			rev=rev*10+reminder;//1  12  127
			num /=10;           //72  7  0
		}
		System.out.println(no+" -> Reverse -> "+rev);
	}

	public static void main(String[] args) {
		new Reverse().getno(721);
		new Reverse().getno(765);

	}
	

}