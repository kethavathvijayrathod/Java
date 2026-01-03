package com.college.app;
import com.college.model.*;
import com.college.service.*;
import java.util.Scanner;

public class Mainapp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String nme=sc.nextLine();
		System.out.println("Enter Age:");
		int ag=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Contact Number:");
		long no=sc.nextLong();
		
		System.out.println("Enter Student Id:");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Department:");
		String dep=sc.nextLine();
		System.out.println("Enter Course Name:");
		String counm=sc.nextLine();
		System.out.println("Enter Course Fee:");
		double fee=sc.nextDouble();
		
		
		Student student=new Student(nme,ag,no,id,dep,counm);
		course cr=new course(000,counm,fee);
		
		student.displaystudentdetails();
		System.out.println("Original Fee :"+cr.getcourseFee());
//		System.out.println("Final Payable Fee"+);
		

		StudentService sr=new StudentService();
		sr.calculateDiscountedFee(dep,cr.getcourseFee());
		
	}

}
