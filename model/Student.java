package edu.mum.cs.cs425.MyStudentMgmtApp.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="students")
public class Student {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	@NotEmpty(message="Provide the Student Number")
	private String studentNumber;
	@NotEmpty(message="Provide the Student's FirstName")
	private String firstName;
	private String middleName;
	@NotEmpty(message="Provide the Student's LastName")
	private String lastName;
	private Float cgpa;
	private LocalDate dateOfEnrollment;
	
	
	
	public Student() {
		
	}
	
	public Student(String studentNumber, String firstName, String middleName, String lastName,
			Float cgpa, LocalDate dateOfEnrollment) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public String toString() {
		return getStudentNumber() + " " + getFirstName() + " " + getLastName();
	}
	
	public Transcript getTranscript() {
		return transcript;
	}

	public void setTranscript(Transcript t) {
		this.transcript = t;
	}
	
	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom c) {
		this.classroom = c;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="classroom_id")
	private Classroom classroom;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "transcript_fk")
	private Transcript transcript;
}
