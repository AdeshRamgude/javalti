package mapping;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CourseDetails")
public class Course {
	@Id
	@Column
	private int courseid;
	@Column
	private String courseName;
	@Column
	private int duration;
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@OneToMany
	private Set<Student> students;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseid, String courseName, int duration) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.duration = duration;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
