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
@Table(name = "T_COURSES")
public class Course extends Standard{

	@ManyToOne
	Teacher teacher;

	@ManyToOne
	Subject subject;
}
