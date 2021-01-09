package com.service;
import com.dao.*;
import com.controller.*;
import com.model.*;

public interface StudentService {

	public void saveStudentObj(Student studentObj);
 
	public List<Student> getAllStudents();
 
	public Student getStudentObj(int theId);
 
	public void removeStudentObj(int theId);
}
