package com.college.model;

public class Student extends person {
	
	private int studentId;
	private String department;
	private String courseName;
	
	public Student() {
		
	}
	
	public Student(String name,int age ,long contactNumber,int studentId,String department,String courseName) {
		super(name,age,contactNumber);
		this.studentId=studentId;
		this.department=department;
		this.courseName=courseName;
	}
	
	public int getstudentId() {
		return studentId;
	}
	public String getdepartment() {
		return department;
	}
	public String getcourseName() {
		return courseName;
	}
	
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public void setcourseName(String courseName) {
		this.courseName=courseName;
	}
	
	public void displaystudentdetails() {
		System.out.println("--- Student Details ---");
		System.out.println("Name:"+getname());
		System.out.println("Age:"+getage());
		System.out.println("student number:"+getcontanctNumber());
		System.out.println("student Id:"+studentId);
		System.out.println("student department:"+department);
		System.out.println("student couser name:"+courseName);
	}

}
