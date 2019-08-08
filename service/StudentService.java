package edu.mum.cs.cs425.MyStudentMgmtApp.service;

import java.util.List;


import edu.mum.cs.cs425.MyStudentMgmtApp.model.Student;
import edu.mum.cs.cs425.MyStudentMgmtApp.repository.StudentRepository;

public interface StudentService extends StudentRepository {
		
	default Student saveStudent(Student student) {
		return this.save(student);
	}
	
	default Iterable<Student> saveAllStudent(List<Student> students) {
		return this.saveAll(students);
	}
}
