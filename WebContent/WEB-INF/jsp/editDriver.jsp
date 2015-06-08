<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript">
	    	$(document).ready(function() {
	    		var driverLofts = [4,5,6,7,8,9,10];
	    		var dbValue = ${map.driver.loft}
	    		$("#driverLoft").find('option').remove();
	               	for (i=0; i < driverLofts.length; i++){
	               		$("#driverLoft").append('<option value="' + driverLofts[i]+ '">'+driverLofts[i]+'</option>');
	            	}
	               	$("#driverLoft").val(dbValue);
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
   <form:form method="post" action="updateDriver" modelAttribute="driver">  
    <table border="1">  
     	<tr>
     		<td>Loft: </td> 
     		<td><select name="loft" id="driverLoft" "></select></div></td>
		</tr>
		<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" value="${map.driver.manufacturer}" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" value="${map.driver.model}" /></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer" value="${map.driver.shaftManufacturer}" /></td>
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel" value="${map.driver.shaftModel}" /></td>
		</tr>
		<tr>
			<td>Shaft raw weight: </td>
			<td><input type="number" name="ShaftRawWeight" min="30" max="150" value="${map.driver.shaftRawWeight}" /></td>					
		</tr>
		<tr>
			<td>Shaft Flex: </td>
			<td><input type="text" name="ShaftFlex" value="${map.driver.shaftFlex}" /></td>	
		</tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" value="${map.driver.grip}" /></td>					
		</tr>				
				
    </table> 
  	
  	<form:hidden path="driverId" value="${map.driver.driverId}" />  
  	 
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
   </form:form>  
  </div>  

</body>  
</html>  