package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToLearnDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		

	}

}
