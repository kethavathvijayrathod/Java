package Test;

public class MiddleSum {
     public void getnum(long num) {
      if(num<0) {                 // to change neg no to pas no
    	  num=Math.abs(num);   
      }
      String s=Long.toString(num);
      int len=s.length();
      int first=s.charAt(0)-'0';
      int last =s.charAt(len-1)-'0';
      int midsum=0;
      for(int i=1;i<len-1;i++) {
    	   midsum=midsum+s.charAt(i)-'0';
      }
       System.out.println(midsum==first+last?"Equal":"Not Equal");
    	  }
	public static void main(String[] args) {
		new MiddleSum().getnum(75547);
		new MiddleSum().getnum(765);

	}
}
