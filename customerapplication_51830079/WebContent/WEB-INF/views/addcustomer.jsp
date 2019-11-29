<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddCustomer page</title>
<style type="text/css">
body {
background-image:url("C:/Users/Lenovo/Desktop/images (2).jpg");
}

#button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 5px 8px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin:auto;
}
	.error{
		color: red;
		font-family: serif;
		font-style: italic;
	}
	h2{
	color:white
	}
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	<form:hidden path="id"/>
	<table style="margin:auto">
	
	<tr><td><h2>Enter name:</h2><td/> <form:input path="name"/><form:errors path="name" class="error"/></tr><br/>
	<tr><td><h2>Enter address:</h2><td/> <form:input path="address"/><form:errors path="address" class="error"/></tr><br/>
	<tr><td><h2>Enter phoneNo:</h2><td/><form:input path="phoneNo"/><form:errors path="phoneNo" class="error"/></tr><br/>
	<tr><td><h2>Enter email:</h2><td><form:input path="email"/><form:errors path="email" class="error"/></tr><br/>
	<tr><td><input type="submit" id="button"/></td></tr>
	</table>
</form:form>
</body>
</html>




