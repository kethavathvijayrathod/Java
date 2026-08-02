package Arrays;

import java.security.spec.NamedParameterSpec;

public class Ex1 {

	public static void main(String[] args) {
		String[] names=new String[4];
		
		names[0]="John";
		names[1]="Alice";
		names[2]="Bob";
		names[3]="Emma";
		
		for(String name:names) {
			System.out.println(name);
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i +" "+names[i]);
		}
			

	}

}
