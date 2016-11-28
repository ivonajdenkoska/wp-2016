<%@ page import="mk.ukim.finki.wp.model.Order" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Order order = (Order) request.getAttribute("order"); %>
<html>
<head>
    <title>Order Details</title>
</head>
<body>
<h3>Order Details</h3>
<div>
    <div>
        <span><strong>OrderId:</strong></span>
        <span><%=order.getOrderId()%></span>
    </div>
    <div>
        <span><strong>Pizza Type:</strong></span>
        <span><%=order.getPizzaType()%></span>
    </div>
    <div>
        <span><strong>Client Name:</strong></span>
        <span><%=order.getClientName()%></span>
    </div>
    <div>
        <span><strong>Client Address:</strong></span>
        <span><%=order.getClientAddress()%></span>
    </div>
</div>
</body>
</html>