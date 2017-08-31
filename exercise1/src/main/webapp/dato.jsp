<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Øving 2, dato</title>
	</head>
	<body>
		<p><%out.println(new java.util.Date()); %></p>
		<p><script>document.write(new Date());</script></p>
	</body>
</html>