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

//@Entity
//@Table(name = "T_ROLES")
public class Role {

	public enum RoleEnum {
		ROLE1(1), ROLE2(2), ROLE3(3), ROLE4(4), ROLE5(5);

		private int level = 10;

		RoleEnum(int l) {
			level = l;
		}
	}

	String label;
	List<Right> rights;

}
