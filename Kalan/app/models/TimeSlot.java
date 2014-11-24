/**
 * 
 */
package models;

import java.util.Date;

/**
 * @author IssaCamara
 *
 */
public class TimeSlot {
	
	Date start;
	Long duration;
	Activity activity;
	
	
	public TimeSlot(Date start, Long duration, Activity activity) {
		this.start = start;
		this.duration = duration;
		this.activity = activity;
	}
	
}
