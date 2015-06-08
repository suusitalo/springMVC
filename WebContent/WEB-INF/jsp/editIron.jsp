<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var ironLofts = [];
		var dbIronLoft = ${map.iron.loft}
		var dbIronNumber = ${map.iron.ironNumber}
		for (i=0; i < 35; i++){
			ironLofts.push(i+15);
		}
		for (i=0; i < 35; i++){
    		$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
    	}
		$("#ironNumber").find('option').remove();
       	for (i=1; i <= 9; i++){
       		$("#ironNumber").append('<option value="' + i+ '">'+i+'</option>');
       	}
       	$("#ironNumber").val(dbIronNumber);
       	$("#ironLoft").val(dbIronLoft);  
       	
    });	    
</script>
<html>  
<head>  
	<center><h1>${headerMessage}</h1></center>
</head>  
<body> 
	<h1>EDIT IRON DETAILS: </h1> 
 	
 	<form:errors path="iron1.*" cssClass="error"/> 
 
  <div>  
   <form:form method="post" action="updateIron" modelAttribute="iron">  
    <table border="1">  
     	<tr>
     		<td>Iron Number: </td> 
     		<td><select name="ironNumber" id="ironNumber" "></select></div></td>
		</tr>
     	<tr>
     		<td>Loft: </td> 
     		<td><select name="loft" id="ironLoft" "></select></div></td>
		</tr>
		<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" value="${map.iron.manufacturer}" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" value="${map.iron.model}" /></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer" value="${map.iron.shaftManufacturer}" /></td>
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel" value="${map.iron.shaftModel}" /></td>
		</tr>
		<tr>
			<td>Shaft raw weight: </td>
			<td><input type="number" name="ShaftRawWeight" min="30" max="150" value="${map.iron.shaftRawWeight}" /></td>					
		</tr>
		<tr>
			<td>Shaft Flex: </td>
			<td><input type="text" name="ShaftFlex" value="${map.iron.shaftFlex}" /></td>	
		</tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" value="${map.iron.grip}" /></td>					
		</tr>				
				
    </table> 
  	
  	<form:hidden path="ironId" value="${map.iron.ironId}" />  
  	 
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
   </form:form>  
  </div>  

</body>  
</html>  