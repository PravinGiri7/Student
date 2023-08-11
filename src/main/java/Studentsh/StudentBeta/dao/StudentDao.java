package Studentsh.StudentBeta.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Studentsh.StudentBeta.entity.Student;
import Studentsh.StudentBeta.service.StudentService;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;

	// insertopertion
	public String insertStudent(List<Student> sl) {
		System.out.println("in dao " + sl);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Student student : sl) {
			session.save(student);

		}
		tr.commit();

		return "Student Save Successfully.... ";
	}

	// getoperation all student
	public List<Student> getStudentlist() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

	public List<Student> getStudentId(int roll) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.eq("roll", roll));
		List<Student> list = cr.list();
		return list;

	}

	// getbyname

	public List<Student> getStudentName(String name) {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.eqOrIsNull("name", name));
		List<Student> list = cr.list();
		return list;

	}

	// getbymarks
	public List<Student> getStudentMarks(String marks) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.eq("marks", marks));

		List<Student> list = cr.list();
		return list;

	}

	// delete by id
	public String deleteStudentId(int roll) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student st = session.get(Student.class, roll);

		session.delete(st);
		tr.commit();
		return "Student Deleted by id Successfully.....";

	}

	// delete by name
	public String removeByName(String name) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student stud = session.get(Student.class, name);
		session.delete(stud);
		tr.commit();
		return "Student Deleted by id Successfully.....";

	}

	// update

	public String updateStudent(Student x) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		session.update(x);
		tr.commit();
		session.close();

		return "Student Updated Successfully.....";

	}

	public List<Student> getStudentMar(String marks) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.le("marks", marks));
		List<Student> list = cr.list();
		return list;

	}

	public List<Student> getStudentidle(int roll) {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.lt("roll", roll));
		List<Student> list = cr.list();
		return list;

	}

}
