package testinteractive;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateFunctionality {
	
	public static void main(String[] args){
		
		int a = 2;
		int b = 4;
		Integer ai = new Integer(3);
		Integer bi = new Integer(3);
		if(ai.equals(bi)){
			System.out.println("Integer Comparision");
		}
		
		
		try {
		String startDateString = "11/01/2016";

        // This object can interpret strings representing dates in the format MM/dd/yyyy
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 

        // Convert from String to Date
        Date startDate;
		
			startDate = df.parse(startDateString);
			boolean check = false;
		try{	
			check = checkIfInRange(startDate);
		}
		catch(NullPointerException ne){
			System.out.println(ne);
		}
		System.out.println(check);
		
		startDateString = "11/02/2016";

                // Convert from String to Date
        startDate = df.parse(startDateString);
			
		check = checkIfInRange(startDate);
		System.out.println(check);
		
		startDateString = "11/03/2016";

        // Convert from String to Date
		startDate = df.parse(startDateString);
	
		check = checkIfInRange(startDate);
		System.out.println(check);
		
		startDateString = "11/14/2014";

        // Convert from String to Date
		startDate = df.parse(startDateString);
	
		check = checkIfInRange(startDate);
		System.out.println(check);
		
		
		startDateString = "09/26/2014";

        // Convert from String to Date
		startDate = df.parse(startDateString);
	
		check = checkIfInRange(startDate);
		System.out.println(check);

        // Print the date, with the default formatting. 
        // Here, the important thing to note is that the parts of the date 
        // were correctly interpreted, such as day, month, year etc.
        System.out.println("Date, with the default formatting: " + startDate);

        // Once converted to a Date object, you can convert 
        // back to a String using any desired format.
        String startDateString1 = df.format(startDate);
        System.out.println("Date in format MM/dd/yyyy: " + startDateString1);

        // Converting to String again, using an alternative format
        DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy"); 
        String startDateString2 = df2.format(startDate);
        System.out.println("Date in format dd/MM/yyyy: " + startDateString2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean checkIfInRange(java.util.Date date){
		 
	    Calendar cal= Calendar.getInstance();
	 
	    cal.add(Calendar.YEAR, -1);
	    java.util.Date yearBeforeToday = cal.getTime();
	    cal.add(Calendar.YEAR, 2);
	    java.util.Date yearAfterToday = cal.getTime();
	 
	    throw new NullPointerException();
	    //return date.after(yearBeforeToday) && date.before(yearAfterToday);
	}
	
}
