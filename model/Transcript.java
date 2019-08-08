package edu.mum.cs.cs425.MyStudentMgmtApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transcripts")
public class Transcript {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transcriptId;
	private String degreeTitle;
	
	
	public Transcript() {
		
	}
	public Transcript(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	public Long getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	public String toString() {
		return getDegreeTitle();
	}
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student t) {
//		this.student = t;
//	}
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="student_fk")
//	private Student student;
}
