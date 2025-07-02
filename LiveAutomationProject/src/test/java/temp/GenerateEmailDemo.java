package temp;

import java.util.Date;

public class GenerateEmailDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		//System.out.println(date);
		String dateString = date.toString();
		String noSpacedateString=dateString.replaceAll(" ", "");
		System.out.println(noSpacedateString);
		String noSpaceAndnoColonsDateString=noSpacedateString.replaceAll("\\:", "");
		String emailWithTimeStamp = noSpaceAndnoColonsDateString+"@gmail.com";
		System.out.println(emailWithTimeStamp);
		
		

	}

}
