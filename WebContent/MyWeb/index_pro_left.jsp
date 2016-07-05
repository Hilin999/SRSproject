<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单页面</title>
</head>
<body>
     欢迎您，<br><%=(String)session.getAttribute("name") %>
   <p><a href="find_all_course.jsp" target="right">显示授课课程</a></p>
   <p><a href="select_stu.jsp" target="right">列出选课学生</a></p>
   <p><a href="delete_stu.jsp" target="right">给选课学生打分</a></p>
   <p><a href="insert_stu.jsp" target="right">新添加课程</a></p>
   <p><a href="delete_stu.jsp" target="right">删除已授课程</a></p>
   
   
 
</body>
</html>