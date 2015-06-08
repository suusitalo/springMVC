<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<html>
<head>

</head>
<body>
	<center><h1>${headerMessage}</h1></center>
	<h1>ENTER BALL DETAILS: </h1>
	
 <form:errors path="ball1.*" cssClass="error"/> 
 	
	<form:form method="post" action="addBall" >  
    <table border="1">  
    	<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer"/></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model"/></td>
		</tr>
		<tr>
			<td>Amount: </td>
			<td><input type="number" name="amount" /></td>
		</tr>
	</table> 
  	
  	<table>
     <tr>  
      <td><input type="submit" value="Add new Ball(s) to Inventory" />  
      </td>  
     </tr> 
     </table> 
   </form:form>
	
	
	
	
</body>
</html>