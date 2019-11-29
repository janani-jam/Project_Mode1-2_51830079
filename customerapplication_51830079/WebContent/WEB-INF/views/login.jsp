<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer app login page!</title>
<style type="text/css">

body {
	background-image:url("C:/Users/Lenovo/Desktop/images (2).jpg");
}

h2{
color: white;
font-family: serif;
//font-style: italic;
}

#login {
	background-color: black;
	border: none;
	color: white;
	padding: 5px 8px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: auto
}

.error {
	color: red;
	font-family: sans-serif;
	font-style: italic;
}
</style>
</head>
<body>

	${error }
	<br /> ${message }
	<br />
	<form:form action="login" method="post" modelAttribute="userbean">

		<table style="margin: auto">
			<tr>
				<td><h2>Enter email:</h2></td>
				<td><form:input path="email" /> <form:errors path="email"
						class="error" /></td>
			</tr>
			<tr>
				<td><h2>Enter password:</h2></td>
				<td><form:input path="password" /> <form:errors
						path="password" class="error" /></td>
			</tr>
			<tr>
				<td><h2><input type="submit" id="login" value="Login to App" /></h2></td>
			</tr>
		</table>

	</form:form>
</body>
</html>




