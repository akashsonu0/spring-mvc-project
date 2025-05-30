<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Records</title>
</head>
<body>
	 <!-- toString() gets called -->
	<h1>UserObject details :: ${obj}</h1>

	<hr>

	<!-- Getter methods will be called -->
	<p>ID     is :: ${obj.empId}</p>
	<p>NAME   is :: ${obj.empName}</p>
	<p>SALARY is :: ${obj.empSal}</p>
	 

</body>
</html>