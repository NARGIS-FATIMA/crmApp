package datadriventesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJson {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//Step1: parse Json Physical file into java Object using JsonParse class
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("C:\\Users\\miraj\\OneDrive\\Desktop\\Data\\AppCommonData.json"));
		//Step2:Convert Java Object into JsonObject using Downcasting
		
		JSONObject map = (JSONObject)obj;
		//step3:get the value from json file using key
		System.out.println(map.get("url"));
		System.out.println("browser");
		System.out.println("username");
		System.out.println("password");
		System.out.println("timeOut");
		
	}

}
