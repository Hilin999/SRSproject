<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单页面</title>
</head>
<body>
   欢迎您，<%=session.getAttribute("name") %>
   <p><a href="find_all.jsp" target="right">去选课</a></p><br><br>
  
   <p><a href="find_course.jsp" target="right">列出我的课程表</a></p>
   <p><a href="select_course.html" target="right">查询已选课程</a></p>
   <p><a href="delete_course.html" target="right">删除已选课程</a></p>
   
 
</body>
</html>