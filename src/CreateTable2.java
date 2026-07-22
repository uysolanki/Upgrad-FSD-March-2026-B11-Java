import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable2 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
		);
		
		//System.out.println(connection.isClosed()); //false
		
		String query="CREATE TABLE emp ( eno INT PRIMARY KEY AUTO_INCREMENT, \r\n"
				+ "ename VARCHAR(15) NOT NULL, \r\n"
				+ "salary DECIMAL(6,2) CHECK (salary >= 500), \r\n"
				+ "city VARCHAR(15) DEFAULT 'Pune', \r\n"
				+ "gender VARCHAR(6) CHECK (gender IN ('male','female')), \r\n"
				+ "workmode ENUM('wfo','wfh','hybrid') DEFAULT 'wfo', \r\n"
				+ "email VARCHAR(20) UNIQUE, dob DATE )";
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		System.out.println("Table created");
	}

}
