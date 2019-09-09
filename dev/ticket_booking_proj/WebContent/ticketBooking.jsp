<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<h1>your booking from ${ src } to ${ dest } is confirmed</h1>
<h2>Thank you  ${ nm } Have a successfull journey</h2>
<body>
<form action="ticketBooking.do" method="post">
Name Of the Passenger:<input type="text" name="name"><br></br>
Age:<input type="text" name="age">
Source:<input type="text" name="source">
Destination:<input type="text" name="destination">
<input type="submit" value="SUBMIT">
</form>
</body>
</html>