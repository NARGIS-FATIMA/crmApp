package com.comcast.crm_generic_webdriverutility;

import java.text.SimpleDateFormat;
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
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MMM-DD");
		String date= sdf.format(dateObj);
		return date;
	}

}
