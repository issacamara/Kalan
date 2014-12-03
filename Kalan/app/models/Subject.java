/**
 * 
 */
package models;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name = "T_SUBJECTS")
public class Subject {
	
	@Id
	@Column(name = "CODE")
	String code;

	@Column(name = "DESCRIPTION")
	String description;
	
	@Column(name="TOTAL_HOURS")
	Long totalHours;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
	public List<TimeSlot> timeslots;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
	public List<Student_Subject> student_subjectS;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
	public List<Teacher_Subject> teacher_subjectS;

}
