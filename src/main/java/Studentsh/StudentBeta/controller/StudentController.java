package Studentsh.StudentBeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Studentsh.StudentBeta.entity.Student;
import Studentsh.StudentBeta.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	// 1
	@PostMapping("/addstudent")
	public String insertStudent(@RequestBody List<Student> sl) {
		System.out.println("coming student.." + sl);
		return service.insertStudent(sl);

	}

	@PutMapping("/update2student")
	public String update2Student(@RequestBody List<Student> sl) {
		System.out.println("coming student.." + sl);
		return service.insertStudent(sl);

	}

	// 2
	@GetMapping("/getstudentlist")
	public List<Student> getStudentlist() {
		return service.getStudentlist();
	}

	// 3

	@GetMapping("/getstrol/{roll}")
	public List<Student> getStudentId(@PathVariable int roll) {
		return service.getStudentId(roll);
	}

	// 4
	@GetMapping("/getstname/{name}")
	public List<Student> getStudentName(@PathVariable String name) {
		return service.getStudentName(name);

	}

	// 5
	@GetMapping("/getstmarks/{marks}")
	public List<Student> getStudentMarks(@PathVariable String marks) {
		return service.getStudentMarks(marks);

	}

	// 6
	@DeleteMapping("/delstid/{roll}")
	public String deleteStudentId(@PathVariable int roll) {
		return service.deleteStudentId(roll);
	}

	// 7
	@DeleteMapping("/removename/{name}")
	public String removeByname(@PathVariable String name) {
		return service.removeByname(name);

	}

	// 8
	@PutMapping("/update1")
	public String updateStudent(@RequestBody Student x) {
		return service.updateStudent(x);

	}

	// 9
	@GetMapping("/lemarks/{marks}")
	List<Student> getStudentMar(@PathVariable String marks) {
		return service.getStudentMar(marks);
	}

	// 10
	@GetMapping("/leid/{roll}")
	public List<Student> getStudentidle(int roll) {
		return service.getStudentidle(roll);
	}
}
