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
@Table(name="AS_CURRICULUM_SUBECT")
public class Curriculum_Subject extends Standard {
	
	@Id
	@ManyToOne
	Curriculum curriculum;
	
	@Id
	@ManyToOne
	Subject subject;
	
	
}
