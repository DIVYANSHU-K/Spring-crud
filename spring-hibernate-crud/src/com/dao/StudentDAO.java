package com.dao;
import com.controller.*;
import com.model.*;
import com.service.*;
public interface StudentDAO {
	public void saveStudentObj(Student studentObj);
	 
	public List<Student> getAllStudents();
	 
	public Student getStudentObj(int theId);
	 
	public void removeStudentObj(int theId);
}
