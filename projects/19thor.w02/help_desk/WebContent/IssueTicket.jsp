<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help-Desk</title>
</head>
<body>
<h1>We are here to help you !!</h1>
<form name="issueTicketForm" action="issueTicket" method="post"> 
<pre>Name:   <input type="text" name="name"/>
Mobile: <input type="text" name="mobile"/>
Product: <select name="product">
<option value="select">Select</option>
<option value="tv">Tv</option>
<option value="laptop">Laptop</option>
<option value="washingMachine">Washing Machine</option>
</select>
Issue Type: <select name="issueType">
<option value="select">Select</option>
<option value="repair">Repair</option>
<option value="Broken"></option>
</select>
Description:  <textarea rows="4" cols="40" name="description"></textarea>
<input type="submit" name="Submit"/>
</pre>
</form>

</body>
</html>