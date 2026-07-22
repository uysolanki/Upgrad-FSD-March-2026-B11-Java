import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDriverApp {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/upgradb11jdbcdb", "root", ""
		);
		
		//System.out.println(connection.isClosed()); //false
		
		String query="create table employeeUpgrad(\r\n"								//static
				+ "eno int primary key  auto_increment,\r\n"
				+ "ename varchar(15) not null,\r\n"
				+ "eage int,\r\n"
				+ "egen enum('male','female'))";
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		System.out.println("Table created");
	}

}
