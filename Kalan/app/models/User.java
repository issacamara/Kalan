/**
 * 
 */
package models;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

import models.Right;
import models.Role;
import play.data.validation.Password;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Blob;
import play.db.jpa.Model;

/**
 * @author IssaCamara
 *
 */

@MappedSuperclass
public class User extends Standard {
	
	@Required(message = "required.user.first_name")
	@Column(name = "FIRST_NAME")
	public String firstname;
	
	@Required(message = "required.user.last_name")
	@Column(name = "LAST_NAME")
	public String lastname;
	
	@Required(message = "required.user.birthday")
	@Column(name = "BIRTHDAY")
	public Date birthday;
	
	@Required(message = "required.user.eamil")
	@Unique(message = "unique.user.email")
	@Column(name = "EMAIL")
	public String email;
	
	@Required(message = "required.user.username")
	@Unique(message = "unique.user.username")
	@Size(min = 6, message = "valid.user.username")
	@Column(name = "USERNAME")
	public String username;
	
	@Required(message = "required.user.password")
	@Column(name = "PASSWORD")
	@Size(min = 8, message = "valid.user.password")
	@Password
	public String password;
	
	public Blob picture;
	
	@Lob
	@Column(name = "DESCRIPTION")
	public String description;
	
	@Column(name = "ROLE")
	public Role role;
		
	public User() {
		super();
	}

	public User(String firstname, String lastname, Date birthday, String email,
			String username, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	public String toString() {
	    return email;
	}
}
