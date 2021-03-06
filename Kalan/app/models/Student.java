/**
 * 
 */
package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.data.validation.Required;

/**
 * @author IssaCamara
 * @date
 */

@Entity
@Table(name = "T_STUDENTS")
public class Student extends User {

	@Required(message = "required.student.curriculum")
	@ManyToOne
	public Curriculum curriculum;

	@ManyToOne
	public TimeTable timetable;

	@ManyToOne(cascade = CascadeType.PERSIST)
	public Teacher tuteur;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	public List<Student_Subject> student_subjectS;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	public List<Mark> marks;

	public Student(String firstName, String lastName, Date birthDay,
			String email, String username, String password) {
		super(firstName, lastName, birthDay, email, username, password);
	}

}
