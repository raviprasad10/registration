<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center" style="background-color: skyblue">
		<h2 id="projectDetails">Project Details</h2>
		<table>

			<form:form action="success" method="post"
				modelAttribute="registration">

				<tr>
					<td>Project Name</td>
					<td><form:input path="projectName" size="30" id="projectName"/></td>
					
				</tr>
				<tr>
					<td>Client Name:</td>
					<td><form:input path="clientName" size="30" id="clientName"/></td>
					
				</tr>

				<tr>
					<td>Team Size</td>
					<td><form:input path="teamSize" size="30" id="teamSize"/></td>
					
				</tr>

				<tr>
					<td><input type="submit" value="Submit" name="submit"/></td>
				</tr>
			</form:form>
		</table>
	</div>




</body>
</html>