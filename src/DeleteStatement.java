import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStatement {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
		);
		
		
		String query="delete from emp where eno=2";
		
		Statement st=connection.createStatement();
		
		int rows =st.executeUpdate(query);
		
		System.out.println(rows + " records deleted");
		
		st.close();
		connection.close();
		
	}
}
