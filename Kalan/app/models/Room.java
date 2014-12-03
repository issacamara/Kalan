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
@Table(name = "T_ROOMS")
public class Room extends Standard{
	
	@Id
	String name;
	
}
