package com.college.service;

public class StudentService {
	 
	public void calculateDiscountedFee(String department,double fee) {
		if(department.equals("it")) {
			System.out.println("discount applied:10%");
			System.out.println("final paybale :"+fee*0.90);
		}
		else {
			System.out.println("Discount applied : NO Discount");
			System.out.println("final paybale :"+fee);
		}
	
		
	}

}
