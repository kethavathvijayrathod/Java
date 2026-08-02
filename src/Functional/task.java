

package Functional;
interface Number{
	boolean checknumber(int n);
}

public class task {

	public static void main(String[] args) {
	
		Number num=new Number() {
			
			public boolean checknumber(int n) {
				if(n<=1) {
					return false;
				}
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						return false;
					}
				}
				
				return true;
			}
		};
		
		int number=7;
		System.out.println(num.checknumber(number));

	}

}
