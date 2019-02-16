<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


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
	<div id="wrapper">
		<div id="header" align="center">
		
			<h2>ERM - Employee Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<!--  add our html table here -->
			<table>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Shift In Time</th>
					<th>Shift Out Time</th>
					<th>Clock in Status</th>
					<th>Clock Out Status</th>
					<th>Clock In Time</th>
					<th>Clock Out Time</th>
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="employeeLog" items="${employeeLog}">

					<tr>
						<td colspan="1">${employeeLog.empId}</td>
						<td colspan="2">${employeeLog.fullName}</td>
						<td colspan="1">${employeeLog.clockInTime}</td>
						<td colspan="1">${employeeLog.clockOutTime}</td>
						<td colspan="1">${employeeLog.clockInstatus}</td>
						<td colspan="1">${employeeLog.clockOutstatus}</td>
						<td colspan="1">${employeeLog.empClockInTime}</td>
						<td colspan="1">${employeeLog.empClockOutTime}</td>

					</tr>

				</c:forEach>

			</table>

		</div>

	</div>

	</div>


</body>

</html>
