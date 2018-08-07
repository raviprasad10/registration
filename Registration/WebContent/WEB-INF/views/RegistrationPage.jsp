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
		<h2>Register Details</h2>
		<table>

			<form:form name="form1"  method="post" action="registerUser"
				modelAttribute="registration">

				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" size="30" id="firstName" /></td>

				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" size="30" id="lastName" /></td>

				</tr>

				<tr>
					<td>Email Id</td>
					<td><form:input path="email" size="30" id="email" name="email"/></td>

				</tr>

				<tr>
					<td>Mobile Number:</td>
					<td><form:input path="contactNumber" size="30"
							id="contactNumber" /></td>

				</tr>
				<tr>
					<td>Address</td>
					<td><form:input path="address" size="30" id="address" /></td>

				</tr>
				<tr>
					<td>City</td>
					<td><form:input path="city" size="30" id="city" /></td>

				</tr>



				<td>state</td>
				<td>
					<div id="state">
						<select>
							<option value="Telangana" id="Telangana">Telangana</option>
							<option value="AndhraPradesh" id="AndhraPradesh">Andhra Pradesh</option>
							<option value="Maharastra" id="Maharastra">Maharastra</option>
							<option value="Tamilnadu" id="Tamilnadu">Tamilnadu</option>
						</select>
</div>

					
				</td>
			
 <script type="text/javascript">
					function validate() {

						var pattern = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
						
						if (pattern
								.test(document.getElementById("email").value)) {
							alert("Details validated");
						

						}

						else {
							alert("wrong email pattern");
						
							
						}
					}
						
				</script>


				<tr>
					<td><input type="submit" value="Submit" name="commit" onclick="validate(document.form1.email)"/></td>
				</tr>
			</form:form>
		</table>
	</div>






</body>
</html>
