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
@Table(name="AS_CURRICULUM_SUBJECT")
public class Curriculum_Subject extends Standard {
	
	@ManyToOne
	Curriculum curriculum;
	
	@ManyToOne
	Subject subject;
	
	
}
