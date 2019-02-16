<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<div class="main" >
		<div id="wrapper" align="center">
				<div id="header">
					<h2>ERM - Employee Log Management</h2>
				</div>
			</div>
			
			<div id="container" align="center">
			<h3>Please Enter Employee Login Details </h3>
			
			<form:form action="saveEmployeelog" modelAttribute="employeelog" method="POST">
			
			<table>
			<tbody>
				<tr>
					<th>Employee Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Job Title</th>
					<th>Clock In Time</th>
					<th>Clock Out TIme</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="employee" items="${employees}">
					<tr>
					<td> ${employee.empId} </td>
						<td> ${employee.firstName} </td>
						<td> ${employee.lastName} </td>
						<td> ${employee.jobTitle} </td>
						<td><input type="time"  path="empClockInTime" value="09:00" required></input></td>
						<td><input type="time"  path="empClockOutTime" value="17:00" required></input></td>
						<td><input type="text" path="empId" hidden></input></td>
					</tr>
				</c:forEach>
				<tr>
			 		<td><input type="submit" value="Submit" class="save"/></td>
			 </tr>
			</tbody>
			</table>
			</form:form>
			
			<div style="clear; both;"></div>
			</div>
			</div>
</body>
</html>