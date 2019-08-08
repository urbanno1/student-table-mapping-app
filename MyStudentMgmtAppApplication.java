package edu.mum.cs.cs425.MyStudentMgmtApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.mum.cs.cs425.MyStudentMgmtApp.model.Classroom;
import edu.mum.cs.cs425.MyStudentMgmtApp.model.Student;
import edu.mum.cs.cs425.MyStudentMgmtApp.model.Transcript;
import edu.mum.cs.cs425.MyStudentMgmtApp.service.StudentService;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
	
	@Autowired
	private StudentService service;
	
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student("000-61-0002", "Andel", "Lynna", "Smart", 3.45f, LocalDate.of(2018, 05, 24));
		Student student2 = new Student("000-61-0003", "Mandella", "Lydia", "Agatha", 3.45f, LocalDate.of(2019, 05, 20));
		Student student3 = new Student("000-61-0004", "Hagnus", "Tracy", "Trithia", 3.45f, LocalDate.of(2018, 05, 21));

		Transcript transcript = new Transcript("BS Computer Science");
		Classroom room = new Classroom("McLaughlin building", "M105");

		student.setTranscript(transcript);
		//transcript.setStudent(student);

		student.setClassroom(room);
		student2.setClassroom(room);
		student3.setClassroom(room);

		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student2);
		students.add(student3);

		room.setStudent(students);

		System.out.println(service.saveAllStudent(students));
	}

}
