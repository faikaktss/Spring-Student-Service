package com.faik.Services;

import java.util.List;

import com.faik.Entites.Student;

public interface IStudentService {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentsById(Integer id);
	
	public void deleteStudents(Integer id);
	
	public Student updateStudent(Integer id , Student updatedStudent);
}
