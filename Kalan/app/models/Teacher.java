/**
 * 
 */
package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author IssaCamara
 *
 */
@Entity
@Table(name="T_TEACHERS")
public class Teacher extends User {
	
	//List<Subject> subjectsTaught;

}
