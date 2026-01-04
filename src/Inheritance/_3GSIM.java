package Inheritance;

public class _3GSIM extends _2GSIM{

	public void threeG(){
		System.out.println("Support internet");
	}
	public static void main(String[] args) {

		//		_3GSIM threeg=new _3GSIM();	
		//		 threeg.twoG();              // --> access parent
		//		 threeg.threeG();            // --> access child 
		//		 

		//		 _2GSIM two=new _2GSIM();
		//		  two.twoG();                // --> access parent
		//		  two.threeG();              // --> can't access child


		//		_2GSIM two=new _3GSIM();
		//		 two.twoG();                 // --> access parent
		//		 two.threeG();               // --> can't access child


		//		_3GSIM threeg=new _2GSIM();
		//		 threeg.twoG();              // --> can't access parent
		//		 threeg.threeG();            // --> can't access child


		//		_3GSIM threeg=(_3GSIM)_2GSIM(); // --> Downcast
		//		 threeg.twoG();                 // --> can't access parent
		//		 threeg.threeG();               // --> can't access child


		_2GSIM two=new _3GSIM();     // -->upcasting
		_3GSIM threeg=(_3GSIM) two;  // -->downcasting

		threeg.twoG();              //-->  access parent
		threeg.threeG();            //-->  access child                        
	}

}
