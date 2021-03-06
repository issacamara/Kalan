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

/**
 * @author IssaCamara
 *
 */
@Entity
@Table(name="T_TEACHERS")
public class Teacher extends User {
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	public TimeTable timetable;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
	public List<Teacher_Subject> teacher_subjectS;


	public Teacher(String firstName, String lastName, Date birthDay,
			String email, String username, String password) {
		super(firstName, lastName, birthDay, email, username, password);
	}
	
	
}
