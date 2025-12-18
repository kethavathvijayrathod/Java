package Test;

public class UglyNo {
	public String getnum(int num) {
		while(num!=1) {
			if(num%2==0) {
				num/=2;
			}
			else if(num%3==0) {
				num/=3;
			}
			else if(num%5==0) {
				num/=5;
			}
			else {
				break;
			}
		}
		if(num==1) {
          return "UglyNo";			
		}
		else {
			return "!UglyNo";
		}
	}

	public static void main(String[] args) {
		System.out.println(new UglyNo().getnum(30));
	}

}
