package com.faik.Controller;

import java.util.List;

import com.faik.Entites.Student;

public interface IStudentController {
	
	public Student saveStudent(Student student );
	
	public List<Student> getAllStudents();
	
	public List<Student> getAllStudentsId();

	public Student getStudentById(Integer id);
	
	public void DeleteStudentById(Integer id);
	
	public Student udpateStudent(Integer id , Student updateStudent);
}
