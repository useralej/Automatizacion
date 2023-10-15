<html>
<body>

	<div class="container-fluid">
		<header class="row">
			
		</header>

		<section class="row main clearfix">
			
			<section class="col-xs-12 col-sm-6">
				<form name="form1" class="formulario" action="" method="">
					<h3>Registro de Personas</h3><br>
					<input type="number" id="rut" name="rut" placeholder="Rut (requerido)" size="40" onblur="validarRut()"><br><br>
					<input type="text" id="nombre" name="nombre" placeholder="nombre (requerido)" size="40" onblur="validarNombre()"><br><br>
					<input type="text" id="apellido" name="apellido" placeholder="apellido (requerido)" size="40" onblur="validarApellido()"><br><br>
					<input type="number" id="telefono" name="telefono" placeholder="telefono (requerido)" size="40" onblur="validarTelefono()"><br><br>
					<input type="number" id="FechaIngreso" name="FechaIngreso" placeholder="FechaIngreso (requerido)" size="40" onblur="validarFechaIngreso()"><br><br>
					<input class="boton" type="submit" value="Guardar" onclick="validarFormulario()"><br><br>
					
				</form>
			</section>
		</section>


		<br>
	</div>


	<script src="script.js"></script>
	

</body>
</html>


   