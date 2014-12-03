/**
 * 
 */
package models;

import java.util.List;

import javax.persistence.*;

import play.data.validation.Required;
/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name = "T_CURRICULUMS")
public class Curriculum extends Standard{
	
	@Id
	@Required(message = "required.curriculum.code")
	@Column(name = "CODE")
	public String code;
	
	@Required(message = "required.curriculum.name")
	@Column(name = "NAME")
	public String name;
	
	@Lob
	@Required(message = "required.curriculum.description")
	@Column(name = "DESCRIPTION")
	public String description;
	
	@OneToMany(cascade = CascadeType.DETACH, mappedBy = "curriculum")
	public List<Student> students;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curriculum")
	public List<Curriculum_Subject> curriculum_subjectS;

}
