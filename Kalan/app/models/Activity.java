/**
 * 
 */
package models;

import java.util.Date;

/**
 * @author IssaCamara
 *
 */
public abstract class Activity {
	
	Date start;
	Long duration;
	
	public Activity(Date start, Long duration) {
		super();
		this.start = start;
		this.duration = duration;
	}
	
}
