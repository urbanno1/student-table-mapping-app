package edu.mum.cs.cs425.MyStudentMgmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.MyStudentMgmtApp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
