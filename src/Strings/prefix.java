package Strings;


public class prefix {

	public static void main(String[] args) {
		String[] str={"flower","flow","float","flex","floor"};
		String shortest=str[0];
		String prefix="";
		
		for (int i=0;i<str.length;i++) {
			if(str[i].length()<shortest.length()) {
				shortest=str[i];
				
			}
			
		}
		for(int i=0;i<shortest.length();i++) {
			int count=0;
			for (int j = 0; j < str.length; j++) {
				if(str[j].charAt(i)==shortest.charAt(i)) {
					count++;
					
				}
				
				
			}
			System.out.println(count);
			if(count==str.length) {
				prefix =prefix+shortest.charAt(i);
				
			}
			
		}
		if(prefix.length()>0) {
			System.out.println(prefix);
		}
		else {
			System.out.println("No prefix");
		}
		
		
//		System.out.println(prefix);

	}
	

}
