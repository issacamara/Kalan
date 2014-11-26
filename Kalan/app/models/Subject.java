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
@Table(name = "T_SUBJECTS")
public class Subject {

	@Column(name = "CODE")
	String code;

	@Column(name = "DESCRIPTION")
	String description;
}
