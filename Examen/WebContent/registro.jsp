<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido</title>
</head>
<body>
	<form action="Registro" method="post">
		<table>
		<tr><td>User name:</td><td><input type="text" name="username" placeholder="username (requerido)"></td></tr>
		<tr><td>Password:</td><td><input type="password" name="password" placeholder="password (requerido)"></td></tr>
		<tr><td></td><td><input type="submit" value="Ingresar" onclick="validarFormulario()"></td></tr>
		
		
	
	
		</table>	
	</form>

</body>
</html>