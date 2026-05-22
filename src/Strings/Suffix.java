package Strings;

public class Suffix {

	public static void main(String[] args) {
		String [] str= {"Walking","Eating","Sleeping","Dreaming","Crying"};
		String shot=str[0];
		String suffix="";
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].length()<shot.length()) {
				shot=str[i];	
			}	
		}
		
		for (int i = shot.length()-1;i>=0;i--) {
			int count=0;
			for(int j=0;j<str.length;j++) {
				if(str[j].charAt(str[j].length()-shot.length()+i)==shot.charAt(i)) {
					count++;
				
				
				}
				if(count==str.length) {
					suffix =shot.charAt(i)+suffix;
				}
				
				
			}
			
		}
		System.out.println(suffix);

	}

}
