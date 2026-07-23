import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertPreparedStatement {
	
public static void main(String[] args) throws Exception
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name");
	String a=sc.next();   //Virat
	
	System.out.println("Enter your age");
	int b=sc.nextInt();   //37
	
	System.out.println("Enter your gen");
	String c=sc.next();  //male
	
	Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
	Connection connection = DriverManager.getConnection(
	    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
	);
	
	String query="insert into employeeupgrad(ename,eage,egen) values (?,?,?)";
	
	PreparedStatement ps=connection.prepareStatement(query);
	ps.setString(1, a);
	ps.setInt(2, b);
	ps.setString(3, c);
	
	
	int rows=ps.executeUpdate();
	
	System.out.println(rows + "records inserted");
	
	ps.close();
	connection.close();
	
	
}
}
