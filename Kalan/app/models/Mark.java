/**
 * 
 */
package models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import play.data.validation.*;

/**
 * @author IssaCamara
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "T_MARKS")
public class Mark extends Standard {
	public enum Period {
		PERIOD1("1st PERIOD"), PERIOD2("2nd PERIOD"), PERIOD3("3rd PERIOD"), PERIOD4(
				"4th PERIOD");

		public String title;

		private Period(String title) {
			this.title = title;
		}
	}

	@Required(message = "required.mark.coef")
	@Column(name = "COEFF")
	public Double coeff;

	@Required(message = "required.mark.mark")
	@Column(name = "VALUE")
	public Double mark;

	@Required(message = "required.mark.period")
	@Enumerated(EnumType.STRING)
	@Column(name = "PERIODE")
	public Period period;

	@Required(message = "required.mark.year")
	@Pattern(regexp = "[0-9]{4}", message = "valid.mark.annee")
	@Column(name = "YEAR")
	public String year;
	
	
	@Required(message = "required.mark.subject")
	@ManyToOne
	public Subject subject;
	
	@Required(message = "required.mark.student")
	@ManyToOne
	public Student student;

	/**
*
*/
	public Mark() {
		super();
	}

}