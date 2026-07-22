import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStatement {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
	);
	
	//System.out.println(connection.isClosed()); //false
	
	String query="insert into emp(ename,salary,city,gender,workmode,email,dob) \r\n"
			+ "values \r\n"
			+ "('Ben',800.0,'Delhi','male','wfh','ben@gmail.com','2002-11-12')";
	
	Statement st=connection.createStatement();
	
	int rows=st.executeUpdate(query);
	
	System.out.println(rows + "records inserted");
}

}
