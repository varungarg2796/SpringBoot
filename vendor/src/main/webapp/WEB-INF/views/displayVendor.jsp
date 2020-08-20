<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<html>
<head>
    <title>Vendors</title>
</head>
<body>

<h1>Vendors</h1>

<table>
    <tr>
        <th>id</th>
        <th>code</th>
        <th>name</th>
        <th>type</th>
        <th>email</th>
        <th>phone</th>
        <th>Address</th>

    </tr>
    <c:forEach items="${vendors}" var="vendor">
        <tr>
            <td>${vendor.id}</td>
            <td>${vendor.code}</td>
            <td>${vendor.name}</td>
            <td>${vendor.type}</td>
            <td>${vendor.email}</td>
            <td>${vendor.phone}</td>
            <td>${vendor.address}</td>
            <td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
            <td><a href="showUpdate?id=${vendor.id}">Edit</a></td>
        </tr>
    </c:forEach>

</table>

<a href="showCreate">Add location</a>

</body>
</html>