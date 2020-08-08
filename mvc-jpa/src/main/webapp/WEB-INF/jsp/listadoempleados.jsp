<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Listado de empleados</title>
</head>
<body>
<h1>Listado de empleados y profesionales</h1>

<table>
	<tr>
		<th>ID</th><th>Nombre</th><th>Apellido</th><th>Epecialidad</th><th>Telefono</th>
		<th>Acciones</th>
	</tr>
	<c:forEach items="${lempleados}" var="listas">
	<tr>
		<td>${listas.getIdempleado()}</td>
		<td>${listas.getNombre()}</td>
		<td>${listas.getApellido()}</td>
		<td>${listas.getEpecialidad()}</td>
		<td>${listas.getTelefono()}</td>
		<td>
			<a href="eliminarempleado/${lista.getId()}">Eliminar</a> &nbsp;
			<a href="editarempleado/${lista.getId()}">Editar</a> &nbsp;
		</td>
	</tr>
	</c:forEach>
</table>

<a href="${pageContext.request.contextPath}">Volver a la página principal</a>

</body>
</html>