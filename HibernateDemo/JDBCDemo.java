package HibernateDemo;
import java.sql.*;
public class JDBCDemo {


	
		
		public static void main(String [] args) {
			String jdbcurl = "jdbc:postgresql://localhost:5432/HibernateDemoEB";

			String user = "axelor";
			String password = "axelor";
			

			try {
				System.out.println("connecting to database"+jdbcurl);
				
				Connection myConn = DriverManager.getConnection(jdbcurl,user,password);
							
				System.out.println("Connection Successful!!");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	//<mapping class="hibernateGradle.Student"/>

