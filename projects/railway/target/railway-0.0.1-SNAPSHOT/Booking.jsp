<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Railway ticket Booking</h1>

	<form action="bookticket">
		<pre>

Source : <input type="text" name="source">
Destination : <input type="text" name="destination">
Date of Journey : <input type="text" name="doj">
Passenger Name : <input type="text" name="passenger">
Class: <select name="class">
<option>General</option>
<option>Sleeper</option>
<option>1T AC</option>
<option>3T AC</option>
</select>
<input type="submit" value="Book"><input type="reset"
				value="clear">
				</pre>

	</form>
</body>
</html>

