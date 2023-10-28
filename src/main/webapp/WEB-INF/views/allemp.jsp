<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Students</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style type="text/css">
tr:first-child {
	font-weignt: bold;
	background-color: #2980b9;
}
.emp-div{
position:relative;
left: 150px;
top:120px
}
.container{
max-width: 990px	
}
.form-group{
position: relative;
  left: 72%;
  top: 60px;
}
</style>
</head>
<body>



<jsp:include page="sidenavbar.jsp" />      
<div class="emp-div">

<div class="form-group">
			<a class="btn btn-secondary" href="/empControl/addemp">Add
				Employee</a>
		</div>
	<div class="container">
		<h2>Employes list</h2>
		<%-- <c:if test="${not empty success}">
			<div class="alert alert-success" role="alert">${success}</div>
		</c:if> --%>

		<hr />
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<td>Emp id</td>
					<td>Employee Name</td>
					<td>MOBILE NUMBER</td>
					<td>skill</td>
					<td>Modify</td>
					
				</tr>
				<c:forEach items="${emplist}" var="emp">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.name}</td>
						<td>${emp.phoneNumber}</td>
						<td>${emp.skill}</td>
						<td><a style="color: green;" href="<c:url value='/empControl/getUpdate/${emp.id}'/>">Modify</a></td>
					<%-- 	<td><a style="color: red;" href="<c:url value='/delete-${student.name}' />">Delete</a></td> --%>
					</tr>
				</c:forEach>
		</table>
		<hr />
		
	</div>
	</div>
</body>
</html>