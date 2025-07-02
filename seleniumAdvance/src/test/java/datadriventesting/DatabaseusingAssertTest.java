package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class DatabaseusingAssertTest {
	
	@Test
	public void projectCheckTest() throws SQLException {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "root");
		System.out.println("Executed");
		Statement stat = conn.createStatement();
		int resultSet=stat.executeUpdate("INSERT INTO authors (id,name,email) VALUES(4,\"MirajAnsari\",\"miraj@.gmailcom\");");
		
		System.out.println(resultSet);
		
		conn.close();
		
		
	}

}
