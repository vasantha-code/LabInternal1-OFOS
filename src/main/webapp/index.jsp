<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>OFOS - Online Food Ordering</title>
</head>
<body>
    <h2>Online Food Ordering System</h2>
    <form action="main" method="post">
        <label>Customer Name:</label>
        <input type="text" name="customerName" required><br><br>

        <label>Food Item:</label>
        <input type="text" name="foodItem" required><br><br>

        <label>Quantity:</label>
        <input type="number" name="quantity" min="1" required><br><br>

        <input type="submit" value="Place Order">
    </form>
</body>
</html>
