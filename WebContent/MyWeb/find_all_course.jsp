<%@ page language="java" import="util.DbUtil,java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="c" class="util.DbUtil" scope="request"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询所有学生信息界面</title>
</head>
<body>
   <% Connection conn=c.getConnection(); 
   String ssn=(String)session.getAttribute("ssn");
   String sql="select * from section where professor=?";
   PreparedStatement stmt=conn.prepareStatement(sql);
   stmt.setString(1, ssn);
   ResultSet rs=stmt.executeQuery();
   rs.last();
   %>
   <center>
       授课表：
    <font size="5" color="red"><%=rs.getRow() %></font>条
      <table border="2" bgcolor="cccfff" width="650">
        <tr bgcolor="BBCCCC" align="center">
           <td>序号</td>
           <td>排课号</td>
           <td>日期</td>
           <td>时间</td>
           <td>教室</td>
           <td>容量</td>
           <td>课号</td>
        </tr>
      <%rs.beforeFirst(); 
      while(rs.next()) {
      %>
        <tr align="center">
           <td><%=rs.getRow()%></td>
           <td><%=rs.getInt("sectionNo")%></td>
           <td><%=rs.getString("dayOfWeek")%></td>
           <td><%=rs.getString("timeOfDay")%></td>
           <td><%=rs.getString("room")%></td>
           <td><%=rs.getInt("seatingCapacity")%></td> 
           <td><%=rs.getInt("courseNo")%></td>  
        </tr>
      <%}%>
       </table>
   </center>
 
 </body>
</html>