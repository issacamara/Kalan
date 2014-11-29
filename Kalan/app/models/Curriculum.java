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
@Table(name = "T_CURRICULUMS")
public class Curriculum extends Standard{

	@Column(name = "NAME")
	String name;

	@Lob
	@Column(name = "DESCRIPTION")
	String description;

}
