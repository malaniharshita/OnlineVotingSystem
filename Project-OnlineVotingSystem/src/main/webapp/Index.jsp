<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Voting System</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file = "Navbar.jsp" %>
<body>
<div class="form-container">
<form action="VoterLogin" method="post">
<h3>Enter your Voter Card Number</h3>
<label for = "voterNumber" class="form-elements form-label"><b>Voter ID</b></label>
<br>
<input id = "voterNumber" name="voterNumber" class="form-elements form-input" type="text"/>
<br>
<button type = "Submit" class="form-elements form-button">Login</button>
<br>
<a href = "AdminLogin.jsp" class = "index-a">Admin</a>
</form>
</div>
</body>
</html>