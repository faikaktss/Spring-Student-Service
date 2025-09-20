package com.faik.Controller.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.faik.Controller.IStudentController;
import com.faik.Entites.Student;
import com.faik.Services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IStudentService studentService;
	
	
	//Normalde burada Dto lar kullanılır

	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping(path = "/list")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}



	@Override
	public List<Student> getAllStudentsId() {
		// TODO Auto-generated method stub
		return null;
	}


	
	@GetMapping(path = "/list/{id}")
	@Override
	public Student getStudentById(@PathVariable(name = "id") Integer id) {
		return studentService.getStudentsById(id);
	}

	@GetMapping(path = "/delete/{id}")
	@Override
	public void DeleteStudentById(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudents(id);
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public Student udpateStudent(@PathVariable(name = "id") Integer id,@RequestBody Student updateStudent) {
		return studentService.updateStudent(id, updateStudent);
	}
}
