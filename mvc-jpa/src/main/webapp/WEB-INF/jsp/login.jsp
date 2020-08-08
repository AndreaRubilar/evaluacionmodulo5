<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Customizado Login</title>
	</head>
	<body>
		<h3>Mi Login</h3>
		<%
			String error = (String) request.getAttribute("error");
			if (error != null && error.equals("true")) {
				out.println("<h4 style=\"color:red\">Invalid login credentials. Please try again!!</h4>");
			}
		%>
	
		<form name='loginForm' action="<c:url value='login' />" method='POST'>
	
			<table>
				<tr>
					<td>Usuario:</td>
					<td><input type='text' name='username' value=''></td>
				</tr>
				<tr>
					<td>Clave:</td>
					<td><input type='password' name='password' /></td>
				</tr>
				<tr>
					<td><input name="submit" type="submit" value="Ingresar" /></td>
					<td><input name="reset" type="reset" /> <input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" /></td>
	
				</tr>
			</table>
	
		</form>
	</body>
</html>
