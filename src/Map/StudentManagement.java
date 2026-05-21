package Map;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hashtable<Integer,String> std=new Hashtable<>();

		int choice ;
		System.out.println("========= STUDENT MANAGEMENT SYSTEM ========= ");
		while(true) {
			System.out.println("\n1. Add Student\r\n"
					+ "2. Search Student\r\n"
					+ "3. Update Student\r\n"
					+ "4. Remove Student\r\n"
					+ "5. Display All Students\r\n"
					+ "6. Check Student Exists\r\n"
					+ "7. Total Students\r\n"
					+ "8. Exit\r\n \n"
					+ "Enter Your Choice :");

			choice=sc.nextInt();


			switch (choice) {
			case 1:{
				System.out.println("Enter Student Id: ");
				int id=sc.nextInt();
				sc.nextLine();
				if(std.containsKey(id)) {
					System.out.println("Student Id Alreadt exists");
				}
				else {
					System.out.println("Enter Student Name :");
					String name = sc.nextLine();

					std.put(id, name);
					System.out.println("Student added successfully");
					
				}

				break;
			}
			case 2:{
				System.out.println("Enter Student Id to Search: ");
				int id = sc.nextInt();
				sc.nextLine();

				if(std.containsKey(id)) {
					System.out.println("Student found");
					System.out.println("Student Id: "+id);
					System.out.println("Student Name: "+std.get(id));
				}
				else {
					System.out.println("Student Not Found");
				}
				break;
			}
			case 3:{
				System.out.println("Enter Student Id to Update: ");
				int id = sc.nextInt();
				sc.nextLine();

				if(std.containsKey(id)) {
					System.out.println("Enter New name to  update : ");
					String name = sc.nextLine();

					std.put(id, name);
					System.out.println("Upadted Successfully");
				}
				else {
					System.out.println("Student not found");

				}
				break;

			}

			
		case 4:{
			System.out.println("Enter the Student id to remove :");
			int id = sc.nextInt();
			sc.nextLine();
			
			if(std.containsKey(id)) {
				std.remove(id);
				System.out.println("Student removed successfully");
			}
			else {
				System.out.println("Student not found");
			}
			break;
		}
		
		case 5:{
			if(std.isEmpty()) {
				System.out.println("No Student Found");
			}
			else {
				System.out.println("Student List");
				for(Map.Entry<Integer, String> list : std.entrySet()) {
					
					System.out.println("ID: "+list.getKey()+" -> "+"Name: "+list.getValue());
					
				}
			}
			break;
		}
		case 6:{
			System.out.println("Enter the student Id to Check Student Exists");
			int id=sc.nextInt();
			sc.nextLine();
			
			if(std.containsKey(id)) {
				System.out.println("Student Exists");
			}
			else {
				System.out.println("Student does not Exist");
			}
			break;
			
		}
		case 7:{
			System.out.println("Total Student: "+std.size());
			break;
		}
		case 8:{
			System.out.println("Thank you....Bye");
			System.exit(0);
			
		}
		default :{
			System.out.println("Invaild choice");
			break;
		}

			}
		
		}
	


	}

}
