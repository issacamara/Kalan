/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IssaCamara
 *
 */
public class TimeTable {

	// 7 days
	public TimeSlot[][] table = new TimeSlot[7][24];

	public void add(TimeSlot ts, int day, int startTime) {
		table[day][startTime] = ts;
	}
	
	public void remove(TimeSlot ts, int day, int startTime) {
		table[day][startTime] = null;
	}
}
