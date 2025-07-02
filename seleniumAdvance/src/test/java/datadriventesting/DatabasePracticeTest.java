package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabasePracticeTest {

	public static void main(String[] args) throws Throwable {
		
		Connection conn =null;
		try {
		//step1: load/register the database drive
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		//Step2:connect to database
		
	    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "root");
		System.out.println("Executed");
		
		//step3: create sql statement
		
		Statement stat = conn.createStatement();
		
		//step4:execute selenium query & get Result
		
		ResultSet resultset = stat.executeQuery("select * from authors");
		while(resultset.next()) {
			System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
			
		}
		}catch (Exception e) {
			System.out.println("handle Exception");
		}
		
		finally {
			//step5:close the connection
			
			conn.close();
			System.out.println("====close the connection====");
		}
		

	}

}
