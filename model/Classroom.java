package edu.mum.cs.cs425.MyStudentMgmtApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classrooms")
public class Classroom {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId;
	private String buildingName;
	private String roomNumber;

	public Classroom() {

	}

	public Classroom(String buildingName, String roomNumber) {
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String toString() {
		return getBuildingName() + ", " + getRoomNumber();
	}
	
	public List<Student> getStudent() {
		return studentsList;
	}

	public void setStudent(List<Student> student) {
		this.studentsList.addAll(student);
	}
	
	@OneToMany(mappedBy = "classroom", cascade=CascadeType.ALL)
	private List<Student> studentsList = new ArrayList<Student>();
}
