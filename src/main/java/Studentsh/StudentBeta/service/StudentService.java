package Studentsh.StudentBeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Studentsh.StudentBeta.dao.StudentDao;
import Studentsh.StudentBeta.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	

	//insert-operation
	public String insertStudent(List<Student> sl ) {
		return  dao.insertStudent(sl);
			}
	
	//getoperationlist
	public List<Student>getStudentlist() {
		return dao.getStudentlist();
	}
	
	//getstudentbyid
	public List<Student> getStudentId (int roll){
		return dao.getStudentId(roll);
	}
	
	//getbyname
	 public List<Student> getStudentName(String name ) {
		 return dao.getStudentName(name);
		 
	 }

	 
	 
	 //getbymarks
	 public List<Student> getStudentMarks(String marks) {
		 return dao.getStudentMarks(marks);
		 
	 }
	 
	 
	 //delete by id 
	 
	 public String deleteStudentId(int roll) {
		 return dao.deleteStudentId(roll);
	 }
	 //deleteby name
	 public String removeByname(String name) {
			return dao.removeByName(name);
		}
	 
	 //update student
	 
	 public String updateStudent(Student x) {
		return dao.updateStudent(x);
	 }
	 //lessorequlto 
	public List<Student> getStudentMar(String marks){
		 return dao.getStudentMar(marks);
	 }
	 //lessorequltoid
	public List<Student> getStudentidle(int roll){
		return dao.getStudentidle(roll);
	}
}
