package com.example.services;

import java.util.List;

import com.example.beans.Students;

public interface ServiceInterface {

	void AddStudents();

	boolean DeleteStudents(int id);

	List<Students> DisplayAll();

	boolean UpdateMarks(int id, int marks);

	boolean UpdateDetails(int id, String name, String add);

	List<Students> GetByStudents(String nm);

	Students GetById(int id);

}
