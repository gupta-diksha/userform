<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eligibility</title>
</head>
<body>
<h1>User Registration</h1>
<form action="MyServlet" method="POST">
Name :<input type="text" name="txtName"/>
<br><br>
Age : <input type="number" name="txtAge" required/>
<br><br>
Contact<br> Number : <input type="number" name="txtContact"/>
<br><br>

<br><input type="Submit" value="Click here"/><br>
</form>
</body>
</html>