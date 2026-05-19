package CallByValue_Reference;

public class Value {
	int a;
	int b;
	
	public static void add(int a,int b) {
		a=10;
		System.out.println("Result method:"+(a+b));
	}

	public static void main(String[] args) {
		Value v= new Value();
		v.a=5;
		v.b=3;
		System.out.println("Before:"+(v.a+v.b));
		add(v.a,v.b);
		System.out.println("After:"+(v.a+v.b));
		

	}

}


//class Main {
//    public void add(int a){
//         a=10;
//        System.out.println("inside method "+a);
//    }
//    public static void main(String[] args) {
//        int a=20;
//        System.out.println("Before "+a);
//        Main m=new Main();
//        m.add(a);
//        System.out.println("After "+a);
//        
//        
//        
//    }
//}