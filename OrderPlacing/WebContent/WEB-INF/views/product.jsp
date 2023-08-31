<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="orders.*" %>
<%Product product=(Product)request.getAttribute("product"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<br><br><br><br>
		<div align="center">
		<form style="width:250px;height:500px" action="http://localhost:8081/OrderPlacing/placeorder">
		<img style="width:100px;height:180px" class="card-img-top" src="<%= product.getImage() %>" style="object-fit: cover; height: 200px;"><br><br>
		<div align="left">
		<p><b><%=product.getProductName() %></b></p>
		<p><%=product.getDescription() %></p>
		<p>$<%=product.getPrice() %></p>
		</div>
		<input type="hidden" name="custID" value="3">
		<button class="btn btn-primary" name="productID" value="<%= product.getProductID() %>">ADD TO CART</button>&nbsp&nbsp&nbsp&nbsp&nbsp
		<button class="btn btn-primary" name="productID" value="<%= product.getProductID() %>">BUY NOW</button>
		</form>
		</div>
	</div>
</body>
</html>