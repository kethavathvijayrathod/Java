package CallByValue_Reference;

public class Reference {
	int a;
	int b;
	public static void add(Reference op){
		op.a=5;
		System.out.println("Method inside:"+(op.a+op.b));
		
		}																																																												
	

	public static void main(String[] args) {
	    Reference op=new Reference();
	    op.a=10;
	    op.b=5;
	    System.out.println("Before "+(op.a+op.b));
	    add(op);
	    System.out.println("After "+(op.a+op.b));

	}

}


//class Main {
//    int a;
//    public void add(Main m){
//         m.a=10;
//        System.out.println("inside method "+m.a);
//    }
//    public static void main(String[] args) {
//         Main m=new Main();
//          m.a=20;
//        System.out.println("Before "+m.a);
//         m.add(m);
//        System.out.println("After "+m.a);
//        
//        
//        
//    }
//}
