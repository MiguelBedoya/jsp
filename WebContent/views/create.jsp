<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Natillera</title>
</head>
<body>
<h1>Crear usuario</h1>

<form action="Person" method="post">
<input type="hidden" name="option" value="Registar">
<table border="1">

<tr>
<td>Nombre:</td>
<td><input type="text" name="name" size="25"/></td>
</tr>

<tr>
<td>Apellido:</td>
<td><input type="text" name="lastName" size="25"/></td>
</tr>


<tr>
<td>Fecha de nacimiento:</td>
<td><input type="date" name="birthDate"></td>
</tr>

<tr>
<td>Edad:</td>
<td><input type="text" name="Age"></td>
</tr>

<tr>
<td>número de documento:</td>
<td><input type="text" name="numberDoc" size="25"/></td>
</tr>

<tr>
<td>número de cuenta:</td>
<td><input type="text" name="numberCue" size="25"/></td>
</tr>

<tr>
<td>Dirección</td>
<td><input type="text" name="Address" size="25"/></td>
</tr>


</table>
<!-- <label for="accountTy" >Tipo de cuenta:</label>
<select name="accountTy">
  <option value="ca">Cuenta de Ahorros</option>
  <option value="cc">Cuenta Corriente</option>
  </select>
<label for="documentTy">Tipo de documento:</label>
<select name="documentTy">
  <option value="cc">Cédula de ciudadania</option>
  <option value="ti">Tarjeta de identidad</option>
  <option value="ce">Cédula extranjera</option>
  <option value="pa">Pasaporte</option>
  <option value="rc">Registro civil</option>
</select>

<div class="Departament">
<label for="Depart">Departamento:</label>
<select name="Depart">
  <option value="CU">Bogotá</option>
  <option value="AN">Antioquia</option>
  <option value="CA">Cauca</option>
  <option value="ME">Meta</option>
  <option value="AT">Atlantico</option>
</select>
</div>


<div class="ciudad">
<label>Cuidad:</label>
<select name="City">
  <option value="BO">Bogotá</option>
  <option value="ME">Medellin</option>
  <option value="CA">Cali</option>
  <option value="BA">Barranquilla</option>
  <option value="MA">Manizales</option>
</select>
</div> -->
<input type="submit" value="Guardar">


</form>


</body>
</html>