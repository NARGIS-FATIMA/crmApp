package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class ToCheckPRojectInBackend {
	
	@Test
	public void projectCheckTest() throws SQLException {
		
		String expectedProj = "books";
		boolean flag=false;
		Driver driverRef  = new Driver();
		DriverManager.registerDriver(driverRef);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "root");
		
		Statement stat = conn.createStatement();
		
		ResultSet resultset = stat.executeQuery("select * from authors;");
		while(resultset.next()) {
			String actProjname = resultset.getString(3);
			if(expectedProj.equals(actProjname)) {
				flag=true;
				System.out.println(expectedProj+"is available");
			}
			
		}
		if(flag==false) {
			System.out.println(expectedProj+"is not available");
			Assert.fail();
		}
		conn.close();
		
	}

}
