package com.college.model;

public class person {
   private String name;
   private int age;
   private long contactNumber;
   
   public person() {
	    }
   
   public person(String name,int age ,long contactNumber) {
	   this.name=name;
	   this.age=age;
	   this.contactNumber=contactNumber;
	   
   }
   
   public String getname() {
	   return name;
   }
   public int getage() {
	   return age;
   }
   public long getcontanctNumber() {
	   return contactNumber;
   }
   
   public void setname(String name){
	   this.name=name;
   }
   public void setage(int age){
	   this.age=age;
   }
   public void setconatactNumber(long contactNumber){
	   this.contactNumber=contactNumber;
   }
}
