package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaBasics {

	public static void main(String[] args) {
		Date dateObj = new Date();	
		SimpleDateFormat sim =new SimpleDateFormat("yyyy-MM-dd");
	    String actDate	=sim.format(dateObj);
	    System.out.println(actDate);
	    
	  
	    Calendar calender = sim.getCalendar();
	    calender.add(Calendar.DAY_OF_MONTH,30);
	    String dateRequired=  sim.format(calender.getTime());
	    
	    System.out.println(dateRequired);
	    
	    
		
		

	}

}
