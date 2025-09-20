package com.faik.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faik.Entites.Student;
import com.faik.Repository.StudentRepository;
import com.faik.Services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}

	@Override
	public Student getStudentsById(Integer id) {
		Optional<Student> optional =  studentRepository.findById(id);
		if(!optional.isEmpty()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void deleteStudents(Integer id) {
		 Student DBDelete =  getStudentsById(id);
		if(DBDelete != null) {
			studentRepository.delete(DBDelete);
		}
	}

	@Override
	public Student updateStudent(Integer id, Student updatedStudent) {
		Student dbUpdate = getStudentsById(id);
		if(dbUpdate != null){
			dbUpdate.setFirstName(updatedStudent.getFirstName());
			dbUpdate.setLastName(updatedStudent.getLastName());
			dbUpdate.setBirthofDay(updatedStudent.getBirthofDay());
			
			return studentRepository.save(dbUpdate);
		}
		return null;
	}
	
	


}
