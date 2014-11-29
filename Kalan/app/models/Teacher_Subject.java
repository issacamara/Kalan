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
@Table(name = "AS_TEACHER_SUBJECT")
public class Teacher_Subject extends Standard{

	@ManyToOne
	Teacher teacher;

	@ManyToOne
	Subject subject;
}
