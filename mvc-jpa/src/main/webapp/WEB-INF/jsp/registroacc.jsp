<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%> 
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario registro accidente</title>
</head>
<style>

form {
 width: 450px;
 margin: auto;
 padding: 10px 20px;
 box-sizing: border-box;
 margin-top: 20px;
 border-radius: 7px;
}
body {
 background-color: rgb(67, 116, 116);

}
h1 {
    text-align: center;
    font-family: fantasy;
    
}
input, textarea {
width: 100%;
margin-bottom: 20px;
padding: 7px;
box-sizing: border-box;
font-size: 17px;
border: none;
}
textarea {
min-height:100px;
max-neight: 200px;
max-width: 100%
}

</style>
<body>
<h1>Formulario de Registro de Accidentes</h1>
<br>
<c:out value="Completa los campos:"/><br><br>

<form action="resultado.jsp" method="get">
<label>Nombre: </label><br>
<input type="text" name="name">
<br>
<label>Apellido: </label><br>
<input type="text" name="apellido">
<br>
<label>Telefono: </label><br>
<input type="text" name="telefono">
<br>
<label>Direccion: </label><br>
<input type="text" name="direccion">
<br>
Tipo de accidente:<select name="selectTipo">
<option value="Leve">Leve</option>
<option value="Moderado">Moderado</option>
<option value="Grave">Grave</option>
</select>
<br><br>
<textarea name="mensaje" placeholder="Describa el accidente"></textarea>

<br><br>
<input type="submit" value="Enviar">

</form>

</body>
</html>