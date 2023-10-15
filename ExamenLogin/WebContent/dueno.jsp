<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form by Colorlib</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Dueño</h2>
					
						<form method="" action="" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="rut" placeholder="Rut" required/>
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="nombre" placeholder="Nombre" required />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="apellido" placeholder="Apellido" required />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-home"></i></label> <input
									type="text" name="name" id="direccion" placeholder="Dirección" required />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Correo" required/>
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-phone"></i></label>
								<input type="text" name="telefono" id="telefono"
									placeholder="Teléfono" required />
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-cat"></i></label>
								<input type="text" name="nombreMascota" id="nombreMascota"
									placeholder="Nombre de la Mascota" required/>
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Guardar" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/dueño.jpg" alt="sing up image">
						</figure>
						<a href="mascota.jsp" class="signup-image-link">Continuar</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>