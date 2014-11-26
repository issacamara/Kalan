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
@Table(name = "T_CLASSES")
public class Class {

	@ManyToOne
	Teacher tc;

	@ManyToOne
	Subject sbt;
}
