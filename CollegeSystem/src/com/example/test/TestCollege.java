package com.example.test;
import java.util.*;

import com.example.beans.Students;
import com.example.services.ServiceCollege;
import com.example.services.ServiceInterface;
public class TestCollege {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		ServiceInterface si = new ServiceCollege();
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add students\n2.Delete student \n3.Update Marks \n4. Modify students");
			System.out.println("5. Search by ID \n6.Search by name \n7. Display All \n8. Sort name");
			System.out.println("9. Sort by id\n10.Sort by marks \n11.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1-> {
				si.AddStudents();
			}
			case 2-> {
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				boolean status = si.DeleteStudents(id);
				if(status) {
					System.out.println("Student Deleted successfully");
				} else {
					System.out.println("Not Found");
				}
			}
			case 3-> {
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("Enter marks");
				int marks = sc.nextInt();
				boolean st = si.UpdateMarks(id, marks);
				if(st) {
					System.out.println("Marks updated");
				}
				else {
					System.out.println("Not found");
				}
				
			}
			case 4-> {
				System.out.println("Enter id by which you can update");
				int id = sc.nextInt();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter address");
				String add = sc.next();
				boolean updstatus = si.UpdateDetails(id, name, add);
			}
			case 5-> {
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				Students s = si.GetById(id);
				if(s!=null) {
					System.out.println("id found");
				}
				else {
					System.out.println("Not found");
				}
				
			}
			case 6-> {
				System.out.println("Enter name");
				String nm = sc.next();
				List<Students> lst = si.GetByStudents(nm);
			}
			case 7-> {
				List<Students> lst = si.DisplayAll();
				lst.stream().forEach(System.out::println);
			}
			case 8-> {
				
			}
			case 9-> {
				
			}
			case 10-> {
				
			}
			case 11-> {
				System.out.println("Thank you---");
			}
			
			}

		}while(choice!=11);

	}


}
