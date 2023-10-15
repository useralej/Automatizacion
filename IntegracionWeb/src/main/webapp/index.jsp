<html>
<body>

	<div class="container-fluid">
		<header class="row">
			
		</header>

		<section class="row main clearfix">
			
			<section class="col-xs-12 col-sm-6">
				<form name="form1" class="formulario" action="" method="">
					<h3>Bienvenido</h3><br>
					<input type="number" id="rut" name="rut" placeholder="Rut (requerido)" size="40" onblur="validarRut()"><br><br>
					<input type="text" id="username" name="username" placeholder="username (requerido)" size="40" onblur="validarUsername()"><br><br>
					<input type="number" id="password" name="password" placeholder="password (requerido)" size="40" onblur="validarPassword()"><br><br>
					<input class="boton" type="submit" value="Ingresar" onclick="validarFormulario()"><br><br>
					
				</form>
			</section>
		</section>


		<br>
	</div>


	<script src="script.js"></script>
	

</body>
</html>


   