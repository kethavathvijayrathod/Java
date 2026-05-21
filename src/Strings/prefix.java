package Strings;

public class prefix {

	public static void main(String[] args) {
		String[] str={"flower","flow","float","flex","floor"};
		String shortest=str[0];
		
		for (int i=0;i<str.length;i++) {
			if(str[i].length()<shortest.length()) {
				shortest=str[i];
				
			}
			
		}
		for(int i=0;i<shortest.length();i++) {
			
		}
		
		System.out.println(shortest);

	}
	

}
// 