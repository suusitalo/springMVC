<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript">
		$(document).ready(function() {
			var wedgeLofts = [];
			var dbWedgeLoft = ${map.wedge.loft}
			var dbBounce = ${map.wedge.bounce}
			for (i=0; i < 15; i++){
				wedgeLofts.push(i+50);
			}
			$("#wedgeLoft").find('option').remove();
	           	for (i=0; i < wedgeLofts.length; i++){
	           		$("#wedgeLoft").append('<option value="' + wedgeLofts[i]+ '">'+wedgeLofts[i]+'</option>');
	           	}
	        $("select#wedgeLoft").val(dbWedgeLoft);  
	        $("#bounce").find('option').remove();
	        for (i=2; i <= 14; i++){
	       		$("#bounce").append('<option value="' + i+ '">'+i+'</option>');
	       	}
	    	$("select#bounce").val(dbBounce);
	    });	    
</script>        	
<html>  
<head>  
	<center><h1>${headerMessage}</h1></center>
</head>  
<body> 
	<h1>EDIT DRIVER DETAILS: </h1> 
 	
 	<form:errors path="driver1.*" cssClass="error"/> 
 
  <div>  
   <form:form method="post" action="updateWedge" modelAttribute="wedge">  
    <table border="1">  
     	<tr>
     		<td>Loft: </td> 
     		<td><select name="loft" id="wedgeLoft"></select></div></td>
		</tr>
		<tr>
     		<td>Bounce: </td> 
     		<td><select name="bounce" id="bounce"></select></div></td>
		</tr>
		<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" value="${map.wedge.manufacturer}" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" value="${map.wedge.model}" /></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer" value="${map.wedge.shaftManufacturer}" /></td>
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel" value="${map.wedge.shaftModel}" /></td>
		</tr>
		<tr>
			<td>Shaft raw weight: </td>
			<td><input type="number" name="ShaftRawWeight" min="30" max="150" value="${map.wedge.shaftRawWeight}" /></td>					
		</tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" value="${map.wedge.grip}" /></td>					
		</tr>				
				
    </table> 
  	
  	<form:hidden path="wedgeId" value="${map.wedge.wedgeId}" />  
  	 
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
   </form:form>  
  </div>  

</body>  
</html>  