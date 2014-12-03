/**
 * 
 */
package models;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name = "AS_STUDENT_SUBJECT")
public class Student_Subject implements Serializable {
	
	@Id
	@ManyToOne
	Student student;
	
	@Id
	@ManyToOne
	Subject subject;
}
