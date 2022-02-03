<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
			Edit here		
			
			<div class="container-fluid">
		<div class="col align-self-center">
			<form action="updatecus" method="GET">
				<div class="form-group">
					<label for="cid" class="col-sm-2 col-form-label">Customer ID</label> <input
						type="number" class="form-control" size="20" name="cid"  value="${param.cid}"readonly="readonly" />
				</div>
				<div class="form-group">
					<label for="cname" class="col-sm-2 col-form-label">Customer Name</label>
					<input type="text" class="form-control" name="cname"  value="${param.cname}" size="20"
						pattern="^[a-zA-Z\s]{1,15}$" required />
				</div>
				<div class="form-group">
					<label for="email" class="col-sm-2 col-form-label">Email</label>
					<input type="email" class="form-control" name="email"  value="${param.email}"  size="20"
						readonly="readonly" />
				</div>
				<div class="form-group">
					<label for="pass" class="col-sm-2 col-form-label">Password</label>
					<input type="text" class="form-control" name="password"  value="${param.password}"  size="20"
						required />
				</div>
				<div class="form-group">
					<label for="phoneno" class="col-sm-2 col-form-label">Phoneno</label>
					<input type="number" class="form-control" name="phoneno"  value="${param.phoneno}"  size="20"
						required />
				</div>
				<div class="form-group">
					<label for="aadharno" class="col-sm-2 col-form-label">Aadharno</label>
					<input type="number" class="form-control" name="aadharno"  value="${param.aadharno}"  size="20"
						required />
				</div>
				<div class="form-group">
					<label for="panno" class="col-sm-2 col-form-label">Panno</label>
					<input type="number" class="form-control" name="panno"  value="${param.panno}"  size="20"
						required />
				</div>

				
				<div class="form-group">
					<label for="gender" class="col-sm-2 col-form-label">Gender</label>
					<input type="text" class="form-control" name="gender"  value="${param.gender}"  size="20"
						required />
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Update Employee</button>
				</div>
			</form>
		</div>

	</div>
</body>
</html>