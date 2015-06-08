<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript">
	    	$(document).ready(function() {
	    		var woodNumbers = [2,3,4,5,6,7];
	    		var woodLofts = [13,14,15,16,17,18,19,20,21];
	    		var dbWoodLoft = ${map.wood.loft}
	    		var dbWoodNumber = ${map.wood.woodNumber}
	    		$("#woodNumber").find('option').remove();
	             	for (i=0; i < woodNumbers.length; i++){
	             		$("#woodNumber").append('<option value="' + woodNumbers[i]+ '">'+woodNumbers[i]+'</option>');
	             	}
	             	$("#woodNumber").val(dbWoodNumber);
	    		
	    		$("#woodLoft").find('option').remove();
	               	for (i=0; i < woodLofts.length; i++){
	               		$("#woodLoft").append('<option value="' + woodLofts[i]+ '">'+woodLofts[i]+'</option>');
	            	}
	               	$("#woodLoft").val(dbWoodLoft);
	            });
	    		
</script>        
<html>  
<head>  
	<center><h1>${headerMessage}</h1></center>
</head>  
<body>  
 <h1>Edit Wood Details </h1>  
  <div>  
   <form:form method="post" action="updateWood" modelAttribute="wood">  
    <table border="1"> 
    	<tr> 
     		<td>Number : </td>
     		<td><select name="woodNumber" id="woodNumber"></select></div></td>
		</tr>
		<tr>
			<td>Wood Loft: </td>
			<td><select name="loft" id="woodLoft" ></select></div></td>
		</tr>
		<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" value="${map.wood.manufacturer}" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" value="${map.wood.model}" /></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer" value="${map.wood.shaftManufacturer}" /></td>
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="shaftModel" value="${map.wood.shaftModel}"  /></td>
		</tr>
		<tr>
			<td>Shaft raw weight: </td>
			<td><input type="number" name="shaftRawWeight" min="30" max="150" value="${map.wood.shaftRawWeight}" /></td>					
		</tr>
		<tr>
			<td>Shaft Flex: </td>
			<td><input type="text" name="shaftFlex" value="${map.wood.shaftFlex}" /></td>					
		</tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" value="${map.wood.grip}" /></td>					
		</tr>
				
    </table> 
  	
  	<form:hidden path="woodId" value="${map.wood.woodId}" />  
  	 
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
   </form:form>  
  </div>  
</body>  
</html>  