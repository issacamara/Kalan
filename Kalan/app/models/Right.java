/**
 * 
 */
package models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author IssaCamara
 *
 */

//@Entity
//@Table(name="T_RIGHTS")
public class Right {
	public enum RightEnum {
		RIGHT_1, RIGHT_2, RIGHT_3, RIGHT_4, RIGHT_5;
		
	}
	
	
	public RightEnum right;
}
