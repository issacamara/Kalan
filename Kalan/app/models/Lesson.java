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
@Table(name = "T_LESSONS")
public class Lesson {
	
	@ManyToOne
	Student student;
	
	@ManyToOne
	Subject subject;
}
