/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import play.data.validation.*;

/**
 * @author IssaCamara
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "T_TIMESLOTS")
public class TimeSlot extends Standard {
	public enum Activity {
		CLASS, OTHER
	}

	@Required(message = "required.timeslot.activity")
	@Enumerated(EnumType.STRING)
	@Column(name = "ACTIVITY")
	public Activity activity;

	@Column(name = "DESCRIPTION")
	public String description;

	@Required(message = "required.timeslot.date")
	@Column(name = "DATE")
	public Date date;

	@Pattern(regexp = "([0-1][0-9]|2[0-3]):([0-5][0-9])", message = "valid.timeslot.starthour")
	@Required(message = "required.creneauHoraire.starthour")
	@Column(name = "START_HOUR")
	public String startHour;

	@Pattern(regexp = "([0-1][0-9]|2[0-3]):([0-5][0-9])", message = "valid.timeslot.endhour")
	@Column(name = "END_HOUR")
	@Required(message = "required.timeslot.endhour")
	public String endHour;

	@ManyToOne
	public Room room;

	@ManyToOne
	public Subject subject;

	@ManyToOne
	public TimeTable timetable;

	public TimeSlot() {
		super();
	}
}