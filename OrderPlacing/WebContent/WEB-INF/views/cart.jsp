<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,orders.*" %>

<% List<Product> products_list=(List<Product>)request.getAttribute("productList"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1 class="text-center">Product List</h1>
        
        <div class="row">
            <% if (products_list != null && !products_list.isEmpty()) { %>
                <% for (int i = 0; i < products_list.size(); i++) { %>
                    <div class="col-md-3">
                        <div class="card" style="width: 100%;">
                        <form action="http://localhost:8081/OrderPlacing/product" method="get">
                         <button><img style="width:100%; height:70%" class="card-img-top" src="<%= products_list.get(i).getImage() %>" style="object-fit: cover; height: 200px;"></button>
                         <input type="hidden" name="productID" value="<%=products_list.get(i).getProductID() %>"></form> 
                            <div class="card-body">
                                <h4 class="card-title"><%= products_list.get(i).getProductName() %></h4>
                                <p class="card-text">$<%= products_list.get(i).getPrice() %></p>
                            </div>
                        </div>
                    </div>
                    <% if ((i + 1) % 4 == 0) { %>
                        </div> 
                        <div class="row"> 
                    <% } %>
                <% } %>
            <% } else { %>
                <p class="text-center">No products to display.</p>
            <% } %>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
