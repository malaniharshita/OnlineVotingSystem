<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
<%
  HttpSession session2 = request.getSession();
  session2.removeAttribute("adminname");
  response.sendRedirect("Index.jsp");
%>
</body>
</html>