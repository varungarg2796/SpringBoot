<%@page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>Create Vendor</title>
</head>
<body>


<form action="saveVendor" method="post">
    <pre>
    ID: <input type="text" name="id" />
    Code: <input type="text" name="code" />
    Name: <input type="text" name="name" />
    Type: <select name="type">
		<option>Regular</option>
		<option>Contract</option>
	  </select>
    Email: <input type="text" name="email" />
    Phone: <input type="text" name="phone" />
        Address: <textarea rows="4" cols="50" name="address" > </textarea>

    <input type="submit" value="save" />
    </pre>
</form>
${message}

<a href="displayVendor">View All</a>
</body>
</html>