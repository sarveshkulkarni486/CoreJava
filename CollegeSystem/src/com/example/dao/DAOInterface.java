package com.example.dao;

import java.util.List;

import com.example.beans.Students;

public interface DAOInterface {

	void AddList(Students s);

	List<Students> Display();

	boolean DeletebyId(int id);

	boolean UpdateMark(int id, int marks);

	boolean UpdateDetails(int id, String name, String add);

	List<Students> GetStudents(String nm);

	Students GetById(int id);


}
