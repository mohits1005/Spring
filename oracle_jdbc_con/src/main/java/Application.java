import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Application{
	public static void main(String args[]) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}
		try {
		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle-sql-instance.cuitmvgieixb.ap-south-1.rds.amazonaws.com:1521:ORCL","oracle_user","vqSNv2dDvF");
		System.out.println("It's working!");
		Statement stmtObj = connection.createStatement();
		ResultSet resObj = stmtObj.executeQuery("select USERNAME from SYS.ALL_USERS");
		while (resObj.next()) {
			String name = resObj.getString("USERNAME");
			System.out.println(name);
		}
		connection.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}
		

		
	}
}