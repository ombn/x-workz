<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tourism Blog</title>
</head>
<body>
<h1>Welcome to Tourism Blog </h1>
<form action="addPlace" method="POST">
<pre>
Place <input type="text"  name="place"/>
State <select name="state">
<option>--Select--</option>
<option value="KAR">Karnataka</option>
<option value="MAH">Maharastra</option>
<option value="BIH">Bihar</option>
</select>
Country <select name="country">
<option>--Select--</option>
<option value="IND">India</option>
<option value="SWI">Switzerland</option>
<option value="BIH">Germany</option>
</select>
Description <textarea rows="5" cols="50" name="description"></textarea>
Popular <input type="text" name="popular"/>
Season <select name="season">
<option>--Select--</option>
<option value="SUM">Summer</option>
<option value="RAI">Rainy</option>
<option value="WIN">Winter</option>
</select>
<input type="submit" value="Add Place">
</pre>
</form>
</body>
</html>