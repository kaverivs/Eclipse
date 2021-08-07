package exercise.week2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStringConversion {
	Date date;
	String str;
	public static void main(String[] args) throws ParseException {
		DateStringConversion c=new DateStringConversion();
		c.dateToString();
		c.stringToDate();
	}

/*
 * using format() method of of DateFormat class //java.text.DateFormat class.
 * DateFormat is an abstract class
 * The child class of DateFormat is SimpleDateFormat.
 * It is the implementation of DateFormat class.
*/
	
	private void stringToDate() {
		// TODO Auto-generated method stub
		
		System.out.println("\nDATE TO STRING CONVERSION");
		date=Calendar.getInstance().getTime();
		System.out.println("\nBefore conversion : date = "+date);
		DateFormat dtFrmt=new SimpleDateFormat();
		str=dtFrmt.format(date);
		System.out.println("\nAfter conversion : String = "+str);
		System.out.println();
	}

	
//using parse() method of DateFormat and SimpleDateFormat classes.
	
	private void dateToString() throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("\nSTRING TO DATE CONVERSION");
		str="31/2/2021";
		System.out.println("\nBefore Conversion : String = "+str);
		SimpleDateFormat d1=new SimpleDateFormat("dd/mm/yyyy");
		date=d1.parse(str);
		System.out.println("\nAfter Conversion : Date = "+date);
		
	}
}
