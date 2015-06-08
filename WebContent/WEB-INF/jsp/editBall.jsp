<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<html>  
<head>  
	<center><h1>${headerMessage}</h1></center>
</head>  
<body> 
	<h1>EDIT DRIVER DETAILS: </h1> 
 	
 	<form:errors path="ball1.*" cssClass="error"/> 
 
  <div>  
   <form:form method="post" action="updateBall" modelAttribute="ball">  
    <table border="1">  
     	<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" value="${map.ball.manufacturer}" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" value="${map.ball.model}" /></td>
		</tr>
		<tr>
			<td>Amount: </td>
			<td><input type="number" name="amount" value="${map.ball.amount}" /></td>					
		</tr>				
				
    </table> 
  	
  	<form:hidden path="ballId" value="${map.ball.ballId}" />  
  	 
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
   </form:form>  
  </div>  

</body>  
</html>  