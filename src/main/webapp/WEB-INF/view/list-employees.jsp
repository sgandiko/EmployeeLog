<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
			<h2>ELM - Employee Log Management</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		<form:form action="search" method="POST">
                Search customer: <input type="text" name="theSearchName" />
                <input type="submit" value="Search" class="add-button" />
         </form:form>
			<table>
				<tr>
					<th>Employee Id</th>
					<th>Name</th>
					<th>Job Title</th>
					<th>Is Active</th>
					<th>Join Date</th>
					<th>Last Date</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${employee}">
				
					<tr>
					<td> ${tempCustomer.empId} </td>
						<td> ${tempCustomer.fullName} </td>
						<td> ${tempCustomer.jobTitle} </td>
						<td> ${tempCustomer.activeStatus} </td>
						<td> ${tempCustomer.joinDate} </td>
						<td> ${tempCustomer.lastDate} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	</div>
	

</body>

</html>
