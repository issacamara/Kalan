/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.*;

import play.db.jpa.*;

/**
 * @author IssaCamara
 *
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class Standard extends Model {
	@Column(name = "CREATED")
	public Date created;
	@Column(name = "MODIFIED")
	public Date modified;

	public Standard() {
		created = new Date();
		modified = new Date();
	}

	@Override
	public <T extends JPABase> T save() {
		modified = new Date();
		return super.save();
	}

	public <T extends JPABase> T simpleSave() {
		return super.save();
	}
}