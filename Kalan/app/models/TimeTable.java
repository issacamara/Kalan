/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import play.data.validation.*;

/**
 * @author IssaCamara
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "T_TIMETABLES")
public class TimeTable extends Standard {
	
	@Required(message = "required.timetable.startDate")
	@Column(name = "START_DATE")
	public Date startDate;
	
	@Required(message = "required.timetable.endDate")
	@Column(name = "END_DATE")
	public Date endDate;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "timetable")
	public List<TimeSlot> timeslots;
	
	@OneToMany(cascade = CascadeType.DETACH, mappedBy = "timetable")
	public List<Student> students;
	
	@OneToMany(cascade = CascadeType.DETACH, mappedBy = "timetable")
	public List<Teacher> teachers;

}