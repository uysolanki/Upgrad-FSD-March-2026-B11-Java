import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletePreparedStatement {
	
public static void main(String[] args) throws Exception
{
	Scanner sc=new Scanner(System.in);
	
	
	
	System.out.println("Enter employee number to delete");
	int a=sc.nextInt();   //1
	
	
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
	);
	
	String query="delete from employeeupgrad where eno=?";
	
	PreparedStatement ps=connection.prepareStatement(query);
	ps.setInt(1, a);
	
	
	
	int rows=ps.executeUpdate();
	
	System.out.println(rows + "records deleted");
	
	ps.close();
	connection.close();
	
	
}
}
