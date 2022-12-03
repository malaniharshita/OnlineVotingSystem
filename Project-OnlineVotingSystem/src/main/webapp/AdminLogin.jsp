<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="Style.css"> 
</head>
<%@ include file="Navbar.jsp"%>
<body>
<div class = "form-container">
<form action="AdminLogin" method="post">
<h3>Admin Login</h3>
<label for="adminName" class="form-elements form-label"><b>Name </b></label>
<br>
<input id="adminName" name="adminName" class="form-elements form-input" type="text"/>
<br>
<label for="password" class="form-elements form-label"><b>Password </b></label>
<br>
<input id="password" name="password" class="form-elements form-input" type="password"/>
<br>
<button type ="Submit" class="form-elements form-button"><b>Login</b></button>
</form>
</div>

</body>
</html>