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


public enum Role {

		ROLE1(1), ROLE2(2), ROLE3(3), ROLE4(4), ROLE5(5);

		public int level = 10;

		Role(int l) {
			level = l;
		}

	String label;
}
