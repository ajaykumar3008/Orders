<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="orders.*" %>
<% Product p=(Product)request.getAttribute("product"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<title>place order</title>
</head>
<body>

<div style="background-color: blue;">
<h3 style="color: white;margin-left: 200px;"> DELIVERY ADDRESS:</h3>
</div>

<h4 style="margin-left: 50px;"><%=(Address)request.getAttribute("address") %></h4>
<div>
<div style="background-color: blue;">
<h3 style="color: white;margin-left: 50px;"> ORDER SUMMARY:</h3>
</div>
<div >
<img style="width:16%;height:22%" alt="product Image" src="<%=p.getImage()%>">
<h4 style="margin-left: 50px;"><%=p.getProductName() %></h4>
<p style="margin-left: 50px;"><%=p.getDescription() %></p>
<p style="margin-left: 50px;"><%=p.getPrice() %></p>
</div>

<div style="background-color: blue;">
<h3 style="color: white; margin-left:50px;"> PRICE DETAILS:</h3>
</div>
<div style="display: flex;">
  <h4 style="margin-left: 50px;">Price:</h4>
  <h4 style="margin-left: 200px;">20</h4>
</div>
<div style="display: flex;">
  <h4 style="margin-left: 50px;">Quantity:</h4>
  <h4 style="margin-left: 160px;">01</h4>
</div>
<div style="display: flex;">
  <h4 style="margin-left: 50px;">GST:</h4>
  <h4 style="margin-left: 210px;"><%=(double)request.getAttribute("gst") %></h4>
</div>
<div style="display: flex;">
  <h4 style="margin-left: 50px;">Total:</h4>
  <h4 style="margin-left: 200px;"><%= (double)request.getAttribute("gst")+p.getPrice()%></h4>
</div>
<div align="center">
<button class="btn btn-primary">MAKE PAYMENT</button>
</div>
</body>
</html>