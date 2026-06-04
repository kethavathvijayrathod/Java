package Banking;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter User name:");
		String uname=sc.nextLine();
		System.out.println("moblie no: ");
		long no=sc.nextLong();
		System.out.println("Account no: ");
		long acno=sc.nextLong();
		System.out.println("Enter balanece :");
		double bal=sc.nextDouble();
		
		Userclass user=new Userclass(uname,no,acno);
		
		System.out.println("Name:"+uname);
		System.out.println("number :"+no);
		System.out.println("Ac number :"+acno);
		
		System.out.println("-------------------");
		System.out.println("1.Desposit\n 2.withdraw");
		
		SavingAccount scc= new SavingAccount(bal);
		
		
	    boolean choice=false;
	    
	    do{
	    	int option;
	    	
	    	switch(option){
	    	case 1:{
	    		System.out.println("Enter Amount to depostie ");
	    		double amount=sc.nextDouble();
	    		scc.deposit(amount);
	    		break;
	    	}	
	    }
	    }
	    	while(choice);
	    {
	    	break;
	    }
	    
		sc.close();

	    
	}
}