package com.example.services;

import java.util.List;
import java.util.Scanner;

import com.example.beans.GraduateStudents;
import com.example.beans.MasterStudents;
import com.example.beans.Students;
import com.example.dao.DAOImpl;
import com.example.dao.DAOInterface;

public class ServiceCollege implements ServiceInterface {
	private DAOInterface di;
	Scanner sc = new Scanner(System.in);
	

	public ServiceCollege() {
		super();
		di = new DAOImpl();
	}

	@Override
	public void AddStudents() {
		int ch=0;
		System.out.println("Enter choice");
		System.out.println("1. Graduate Students");
		System.out.println("2. Master Students");
		ch = sc.nextInt();
		System.out.println("Enter id");
		int pid = sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String pname = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		int[] marks = new int[2];
		if(ch==1 || ch==2) {
			System.out.println("enter marks");
			for(int i=0; i<2; i++) {
				marks[i] = sc.nextInt();
			}
		}
		Students s=null;
		if(ch==1) {	
			System.out.println("enter special subject marks");
			int spmarks = sc.nextInt();
			s = new GraduateStudents(pid, pname, address, marks, spmarks);
		}
		else if(ch==2) {
			System.out.println("Enter thesis subject");
			String thesis = sc.next();
			System.out.println("Enter thesis marks");
			int thmarks = sc.nextInt();
			System.out.println("Enter degree ");
			String degree = sc.next();
			s = new MasterStudents(pid, pname, address, marks, thesis, thmarks, degree);
		}
		di.AddList(s);
			
	}
		

	@Override
	public boolean DeleteStudents(int id) {
		return di.DeletebyId(id);
	}

	@Override
	public List<Students> DisplayAll() {
		return di.Display();
		
	}

	@Override
	public boolean UpdateMarks(int id, int marks) {
		return di.UpdateMark(id, marks);
		
	}

	@Override
	public boolean UpdateDetails(int id, String name, String add) {
		return di.UpdateDetails(id, name, add);
	}

	@Override
	public List<Students> GetByStudents(String nm) {
		
		return di.GetStudents(nm);
	}

	@Override
	public Students GetById(int id) {
		return di.GetById(id);
	}

}
