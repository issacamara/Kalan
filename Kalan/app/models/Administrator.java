/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.*;

/**
 * @author IssaCamara
 *
 */

@Entity
@Table(name = "T_ADMINISTRATORS")
public class Administrator extends User {

	public Administrator(String firstName, String lastName, Date birthDay,
			String email, String username, String password) {
		super(firstName, lastName, birthDay, email, username, password);
	}

	public Administrator() {
		super();
	}

}
