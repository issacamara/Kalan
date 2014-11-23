/**
 * 
 */
package models;

import java.util.*;

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
public class Subject {
	

	List<Student> students;
	List <Teacher> teachers;
	String code;
	String description;
}
