/**
 * 
 */
package models;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name = "T_SUBJECT")
public class Subject extends Activity {

	/**
	 * @param start
	 * @param duration
	 */
	public Subject(Date start, Long duration) {
		super(start, duration);
	}

	List<Student> students;
	List<Teacher> teachers;

	@Column(name = "CODE")
	String code;

	@Column(name = "DESCRIPTION")
	String description;
}
