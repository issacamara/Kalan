/**
 * 
 */
package models;

import java.util.Date;

/**
 * @author IssaCamara
 *
 */
public class Administrator extends User {

	public Administrator(String firstName, String lastName, Date birthDay,
			String email, String username, String password) {
		super(firstName, lastName, birthDay, email, username, password);
		this.save();
	}
	
	
}
