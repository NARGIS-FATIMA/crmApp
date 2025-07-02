package com.comcast.crm_generic_webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random random = new Random();
	    int randomNumber =random.nextInt(5000);
	    return randomNumber;
	}
	
	public String getSystemDateYYYYDDMM() {
	    Date dateObj = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // fixed year format
	    return sdf.format(dateObj);
	}

	public String getRequiredDateYYYYDDMM(int days) {
	    Calendar cal = Calendar.getInstance(); // start from current date
	    cal.add(Calendar.DAY_OF_MONTH, days); // add the required number of days

	    Date updatedDate = cal.getTime(); // get updated date

	    SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd"); // fixed year format
	    return sim.format(updatedDate);
	}
	
//	public String getSystemDateYYYYDDMM() {
//		Date dateObj = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MMM-DD");
//		String date= sdf.format(dateObj);
//		return date;
//	}
//	public String getRequiredDateYYYYDDMM(int days) {
//		Date dateobj = new Date();
//		SimpleDateFormat sim=new SimpleDateFormat("YYYY-MM-dd");
//		sim.format(dateobj);
//		Calendar cal = sim.getCalendar();
//		cal.add(Calendar.DAY_OF_MONTH, days);
//		String afterdate = sim.format(cal.getTime());
//		return afterdate;
//	}

}
