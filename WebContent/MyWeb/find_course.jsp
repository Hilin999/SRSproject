<%@ page language="java" import="util.DbUtil,java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="c" class="util.DbUtil" scope="request"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询我的课表</title>
</head>
<body>
   <% Connection conn=c.getConnection(); 
   String sql="select * from student where name=?";
   PreparedStatement stmt=conn.prepareStatement(sql);
   String name=(String)session.getAttribute("name");
   stmt.setString(1, name);
   ResultSet rs=stmt.executeQuery();
   rs.last();
   %>
   <center>
        排课安排有：
    <font size="5" color="red"> <%=rs.getRow() %></font>条
      <table border="2" bgcolor="ccffbb" width="650">
        <tr bgcolor="green" align="center">
           <td>序号</td>   
           <td>排课号</td>
           <td>日期</td>
           <td>时间</td>
           <td>教室</td>
           <td>容量</td>
           <td>老师</td>
           <td>课号</td>
        </tr>
      <%rs.beforeFirst(); 
      while(rs.next()) {
    	  int attends=rs.getInt("attends");
    	  session.setAttribute("sectionNo", attends);
      }
      rs.close();
	  stmt.close();
      %>
      <% 
    	   String sql2="select * from section where sectionNo=?";
    	   PreparedStatement stmt2=conn.prepareStatement(sql2);
    	   String no1=(String)session.getAttribute("sectionNo");
    	   int no2=Integer.parseInt(no1);
    	   stmt.setInt(1, no2);
    	   ResultSet rs2=stmt2.executeQuery();
    	   while(rs2.next()) {
    	   rs.last();
      %>
      
        <tr align="center">
           <td><%=rs.getRow()%></td>
           <td><%=rs.getInt("sectionNo")%></td>
           <td><%=rs.getString("dayOfWeek")%></td>
           <td><%=rs.getString("timeOfDay")%></td>
           <td><%=rs.getString("room")%></td> 
           <td><%=rs.getString("professor")%></td>
           <td><%=rs.getInt("courseNo")%></td>  
        </tr>
      <%}%>
       </table>
   </center>
</body>
</html>