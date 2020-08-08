<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Listado de clientes</title>
</head>
<body>
<h1>Listado de clientes</h1>

<table>
	<tr>
		<th>ID</th><th>Nombre</th><th>Teléfono</th><th>Correo</th><th>Rubro</th><th>Dirección</th>
		<th>Acciones</th>
	</tr>
	<c:forEach items="${lclientes}" var="lista">
	<tr>
		<td>${lista.getId()}</td>
		<td>${lista.getNombre()}</td>
		<td>${lista.getTelefono()}</td>
		<td>${lista.getCorreoelectronico()}</td>
		<td>${lista.getRubro()}</td>
		<td>${lista.getDireccion()}</td>
		<td>
			<a href="eliminarcliente/${lista.getId()}">Eliminar</a> &nbsp;
			<a href="editarcliente/${lista.getId()}">Editar</a> &nbsp;
		</td>
	</tr>
	</c:forEach>
</table>

<a href="${pageContext.request.contextPath}">Volver a la página principal</a>

</body>
</html>