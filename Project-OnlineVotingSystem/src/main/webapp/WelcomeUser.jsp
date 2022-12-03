<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="Navbar.jsp"%> 
<body>
<div class="form-container">
<form action="Vote" method="post">
<label for="voterNumber" class="form-elements form-label"><b>Enter your voter card number</b></label>
<br>
<input id="voterNumber" name="voterNumber" class="form-elements form-input" type="text"/>
<br>
<label for="partie" class="form-elements form-label"><b>Choose your partie</b></label>
<br>
<select id="partie" name="partie" class="form-elements form-input">
<option value="Aam Aadmi Party">Aam Aadmi Party</option>
<option value="BJP">BJP</option>
<option value="BSP">BSP</option>
<option value="Congress">Congress</option>
<option value="CPI">CPI</option>
</select>
<br>
<button type="Submit" class="form-elements form-button"><b>Submit</b></button>
</form>
</div>

</body>
</html>