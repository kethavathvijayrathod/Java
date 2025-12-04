package Test;

public class MiddleLess {
	public boolean getnum(long num) {
		if(num<0) {
			num=Math.abs(num);  // to change neg no to pas no
		}
		String s=Long.toString(num);
		int len=s.length();
		int midsum=0;
		int first=s.charAt(0)-'0';
		int last=s.charAt(len-1)-'0';
		for(int i=1;i<len-1;i++) {
			midsum=midsum+s.charAt(i)-'0';
		}
		if(first+last>midsum) {
			return true;
		}
		 return false;
	}

	public static void main(String[] args) {
		System.out.println(new MiddleLess().getnum(1672));
		System.out.println(new MiddleLess().getnum(84719));
	}

}
