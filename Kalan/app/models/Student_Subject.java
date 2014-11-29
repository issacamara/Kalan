/**
 * 
 */
package models;

import javax.persistence.*;

/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name = "AS_STUDENT_SUBJECT")
public class Student_Subject {
	
	@ManyToOne
	Student student;
	
	@ManyToOne
	Subject subject;
}
