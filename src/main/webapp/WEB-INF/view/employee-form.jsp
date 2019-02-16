<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<link href="../resources/css/style.css" rel="stylesheet">
	<link href="../resources/css/add-employee-style.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="../resources/css/navigation.css"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<div class="sidebar">
	<a href="#" onclick="window.location.href='${pageContext.request.contextPath}/employee/list'; return false;"><i class="fa fa-fw fa-home"></i>Home</a>
  <a href="#" onclick="window.location.href='showFormForAdd'; return false;"><i class="fa fa-fw fa-user"></i>Add New Employee</a>
  <a href="#" onclick="window.location.href='showFormForEmployeeLog'; return false;"><i class="fa fa-fw fa-user"></i>Employees Login Details</a>
  <a href="#" onclick="window.location.href='loglist'; return false;"><i class="fa fa-fw fa-user"></i>Logging Data</a>
</div>
		<div id="wrapper" align="center">
				<div id="header">
					<h2>ERM - Employee Relationship Manager</h2>
				</div>
			</div>
			
			<div id="container" align="center">
			
			<form:form action="saveEmployee" modelAttribute="employee" method="POST">
			<form:hidden path="empid"/>
			<table>
			<tbody>
			 <tr>
			 <td><label>First Name:</label></td>
			 <td><form:input path="firstName"></form:input></td>
			 </tr>
			 
			 <tr>
			 <td><label>Last Name:</label></td>
			 <td><form:input path="lastName"></form:input></td>
			 </tr>
			 
			 <tr>
			 <td><label>Job Title:</label></td>
			 <td><form:input path="jobTitle"></form:input></td>
			 </tr>
			 
			  <tr>
			 <td><label>Is Active:</label></td>
			 <td><form:input path="isActive"></form:input></td>
			 </tr>
			 
			 <tr>
			 <td><label>Join Date:</label></td>
			 <td><form:input type="date" path="joinDate" /></td>
			 </tr>
			 
			 <tr>
			 <td><label>Last Date:</label></td>
			 <td><form:input type="date" path="lastDate" /></td>
			 </tr>
			 
			 <tr>
			 <td align="left"><input type="submit" value="Submit" class="save"/></td>
			 </tr>
			 
			</tbody>
			</table>
			</form:form>
			</div>
</body>
</html>