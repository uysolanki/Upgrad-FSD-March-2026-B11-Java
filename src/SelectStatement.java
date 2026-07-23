import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStatement {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
		);
		
		String query="SELECT ename, eage\r\n"
				+ "FROM employeeupgrad";
		
		Statement st=connection.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getInt(2));
		}
		
		st.close();
		connection.close();
	}
}
