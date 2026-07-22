import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDriverApp {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
		);
		
		System.out.println(connection.isClosed()); //false
	}

}
