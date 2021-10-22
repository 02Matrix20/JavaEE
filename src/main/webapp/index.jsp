<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accounting sales</title>
</head>
<body>


<form action="shop" method="POST">
    <h1><b> Vavilon store</b></h1>
    <br>Accounting sales</br>
    <br>Seller's name: <input name="username" /></br>
    <br>Quantity of goods: <input name="goods" /></br>
    <br>Price: <input name="price" /></br>
    <br>Availability in stock: <input type="radio" name="stock" value="yes"
                       checked />Yes
    <input type="radio" name="stock" value="no" />No </br>
    <br>Country of origin: <select name="country">
    <option>Ukraine</option>
    <option>Canada</option>
    <option>Spain</option>
    <option>France</option>
    <option>Germany</option>
    <option>Brazil</option>
    <option>India</option>
    <option>Turkey</option>
</select></br>
    <br><input type="submit" value="Submit" />
    </br>
</form>
</body>
</html>