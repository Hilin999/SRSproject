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
   String sql="select * from section ";
   PreparedStatement stmt=conn.prepareStatement(sql);
   ResultSet rs=stmt.executeQuery();
   rs.last();
   %>
   <center>
        排课安排有：
    <font size="5" color="red"> <%=rs.getRow() %></font>条
      <table border="2" bgcolor="ccceee" width="650">
        <tr bgcolor="CCCCCC" align="center">
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
      %>
        <tr align="center">
           <td><%=rs.getRow()%></td>
           <td><%=rs.getInt("sectionNo")%></td>
           <td><%=rs.getString("dayOfWeek")%></td>
           <td><%=rs.getString("timeOfDay")%></td>
           <td><%=rs.getString("room")%></td>
           <td><%=rs.getInt("seatingCapacity")%></td>   
           <td><%=rs.getString("professor")%></td>
           <td><%=rs.getInt("courseNo")%></td>  
        </tr>
      <%}%>
       </table>
   </center>
    添加记录
  <hr color="gray" size="5">
   <form action="../add_section" method="post">
      <table border="0" width="238" height="252">
         <tr><td>排课号</td><td><input type="text" name="sectionNo"></td></tr>
        <tr align="center">
           <td colspan="2">
           <input type="submit" value="提  交">&nbsp; &nbsp; &nbsp; 
           <input type="reset"  value="取   消">&nbsp; &nbsp; &nbsp;
           </td>
       </tr> 
      </table>
   </form>
 </body>
</html>