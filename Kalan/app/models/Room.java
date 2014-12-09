/**
 * 
 */
package models;

import javax.persistence.*;

import play.data.validation.*;

/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name="T_ROOMS")
public class Room extends Standard{
	
	@Unique
	String name;
	
}
