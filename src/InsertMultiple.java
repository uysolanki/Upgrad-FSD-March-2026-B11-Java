import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMultiple {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
	);
	
	//System.out.println(connection.isClosed()); //false
	
	String query1="insert into emp(ename,salary,city,gender,workmode,email,dob) \r\n"
			+ "values \r\n"
			+ "('Kate',900.0,'Pune','female','wfo','kate@gmail.com','2004-02-12')";
	
	String query2="insert into emp(ename,salary,city,gender,workmode,email,dob) \r\n"
			+ "values \r\n"
			+ "('David',1000.0,'Pune','male','wfh','david@gmail.com','1999-07-12')";
	
	String query3="insert into emp(ename,salary,city,gender,workmode,email,dob) \r\n"
			+ "values \r\n"
			+ "('Emily',1100.0,'Jaipur','female','wfo','emily@gmail.com','1998-11-12')";
	
	String query4="insert into emp(ename,salary,city,gender,workmode,email,dob) \r\n"
			+ "values \r\n"
			+ "('Frank',1200.0,'Mumbai','male','hybrid','frank@gmail.com','2001-08-12')";
	
	
	Statement st=connection.createStatement();
	st.addBatch(query1);
	st.addBatch(query2);
	st.addBatch(query3);
	st.addBatch(query4);
	st.executeBatch();
	
	System.out.println("Multiple records inserted");
}

}
