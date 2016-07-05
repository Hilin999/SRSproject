package util;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	 
	
	static String url="jdbc:mysql://127.0.0.1:3306/srsproject";
	static String userName="root";
	static String password="123456";
	static Connection conn=null;
	public static Connection getConnection(){
		
		try{
			 
			Class.forName("com.mysql.jdbc.Driver");	
			conn=DriverManager.getConnection(url,userName,password);
			//DatabaseMetaData meta= conn.getMetaData();
			
		}catch(ClassNotFoundException e){
			
		}		// 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
