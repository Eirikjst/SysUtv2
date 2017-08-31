<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%
	String fornavn = request.getParameter("fornavn");
	String etternavn = request.getParameter("etternavn");
	String interesse = request.getParameter("liste");
%>
		
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; UTF-8">
		<title>øving 2, forms</title>
	</head>
	<body>
			Hei <%= fornavn %> <%= etternavn %><br>
			<h2>Informasjon om <%= interesse %></h2><br>
			<p> <% 	
			if(interesse.equals("Data")){
				out.println("Vedkommende liker å tilbringe tiden sin forran en datamaskin");
			}
			if(interesse.equals("Øl")){
				out.println("Vedkommende er veldig glad i å drikke øl");
			}
			if(interesse.equals("Fotball")){
				out.println("Vedkommende tilbringer kvelden med å se på 22 voksne menn springe etter en ball");
			} 
			%>
	</body>
</html>