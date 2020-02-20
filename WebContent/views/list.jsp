<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>ID</td>
<td>Nombre</td>
<td>Apellido</td>
<td>Tipo Documento</td>
<td>Documento</td>
<td>Edad</td>
<td>Tipo de Cuenta</td>
<td>Número de Cuenta</td>
<td>Departamento</td>
<td>Ciudad</td>
<td>Dirección</td>
<td>Creado</td>
<td>Actualizado</td>
<td>Estado</td>
<td>Acciones</td>
</tr>

<c:forEach var="person" items="${list}">
<tr>
<td><c:out value="${person.sPerson}"></c:out></td>
<td><c:out value="${person.sName}"></c:out></td>
<td><c:out value="${person.sLastName}"></c:out></td>
<td><c:out value="${person.cDocumentType}"></c:out></td>
<td><c:out value="${person.sDocument}"></c:out></td>
  <%-- <json:property name="subtotal" value="${cart.subtotal}"/> --%>

<%-- <td><c:out value="${person.Age}"></c:out></td> --%>
<td><c:out value="${person.biAccountType}"></c:out></td>
<td><c:out value="${person.sAccountNumber}"></c:out></td>
<%-- <td><c:out value="${person.Depart}"></c:out></td>
<td><c:out value="${person.City}"></c:out></td>
<td><c:out value="${person.Address}"></c:out></td> --%>
<td><c:out value="${person.dCreatedAt}"></c:out></td>
<td><c:out value="${person.dUpdatedAt}"></c:out></td>
<td><c:out value="${person.isActive}"></c:out></td>
<td></td>
</tr>
</c:forEach>
</table>

</body>
</html>