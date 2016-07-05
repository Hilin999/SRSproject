package beans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DbUtil;
public class Login {
   private String name=null;
   private String ssn=null;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}
   public Login(){
	   
   }
   public Login(String a, String b){
	   name=a;
	   ssn=b;
   }
   public boolean doLogin(String name2, String ssn2) throws SQLException{
	   boolean f=false;
	   Connection conn= DbUtil.getConnection();
	   String sql= "select * from student where (name=? and ssn=?)";
	   PreparedStatement stmt=conn.prepareStatement(sql);
	   stmt.setString(1, name2);
	   stmt.setString(2, ssn2);
	   ResultSet rs=stmt.executeQuery();
	   if(rs.next()){
		   f=true;
	   }
		   else{
			   f=false;
		   }
	   rs.close();
	   stmt.close();
	   conn.close();
	   return f;
	   }
   
	   public boolean doLogin2(String name2, String ssn2) throws SQLException{
		   boolean f=false;
		   Connection conn= DbUtil.getConnection();
		   String sql= "select * from professor where (name=? and ssn=?)";
		   PreparedStatement stmt=conn.prepareStatement(sql);
		   stmt.setString(1, name2);
		   stmt.setString(2, ssn2);
		   ResultSet rs=stmt.executeQuery();
		   if(rs.next()){
			   f=true;
		   }
			   else{
				   f=false;
			   }
		   rs.close();
		   stmt.close();
		   conn.close();
		   return f;
		
   }
    
}
