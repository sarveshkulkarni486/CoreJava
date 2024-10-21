package com.example.dao;

import java.util.List;

import com.example.beans.GraduateStudents;
import com.example.beans.MasterStudents;
import com.example.beans.Person;
import com.example.beans.Students;

import java.util.ArrayList;

public class DAOImpl implements DAOInterface {
	private static List<Students> stdlist;
	static {
		stdlist = new ArrayList<>();
	}

	@Override
	public void AddList(Students s) {
		stdlist.add(s);
	}

	@Override
	public List<Students> Display() {
		return stdlist;
	}
	public Students GetById(int id) {
		int pos = stdlist.indexOf(new Person(id));
		if(pos!=-1) {
			return stdlist.get(pos);
		}
		return null;
	}
	
	
	@Override
	public boolean DeletebyId(int id) {
		return stdlist.remove(new Person(id));

	}

	@Override
	public boolean UpdateMark(int id, int newmarks) {
		Students s = GetById(id);
		if(s!=null) {
			if(s instanceof MasterStudents) {
				((MasterStudents)s).setThesismarks(newmarks);
				return true;
			}
			else if(s instanceof GraduateStudents) {
				((GraduateStudents)s).setSpmarks(newmarks);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean UpdateDetails(int id, String name, String add) {
		Person p = GetById(id);
		if(p!=null) {
			p.setPname(name);
			p.setAddress(add);
			return true;
		}
		return false;
	}

	@Override
	public List<Students> GetStudents(String nm) {
		List<Students> ls = new ArrayList<>();
		for(Students s1 : stdlist) {
			if(s1.getPname().equals(nm)); {
				ls.add(s1);
			}
		}
		if(ls.size()>0) {
			return ls;
		}
		return null;
	}
	

}
