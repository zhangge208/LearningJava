package TestDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(2001, 1, 10, 12, 23, 45);
		Date d = c.getTime();
		System.out.println(d);
	}
}
