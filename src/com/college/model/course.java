package com.college.model;

public class course {
	private int courseCode;
	private String courseTitle;
	private double courseFee;
	
 public course(int courseCode,String courseTitle,double courseFee) {
	 this.courseCode=courseCode;
	 this.courseTitle=courseTitle;
	 this.courseFee=courseFee;
 }
 
 public int getcourseCode() {
	 return courseCode;
 }
 public String getcourseTitle() {
	 return courseTitle;
 }
 public  double getcourseFee() {
	 return courseFee;
 }
 
 public void setcourseCode(int courseCode) {
	 this.courseCode=courseCode;
 }
 public void setcourseTitle(String courseTitle) {
	 this.courseTitle=courseTitle;
 }
 public void setcourseFee(double courseFee) {
	 this.courseFee=courseFee;
 }
}
