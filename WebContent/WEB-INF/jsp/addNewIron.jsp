<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${cp}/js/addIronLogic.js" type="text/javascript"> 
</script>
</script>
<html>
<head>
	<center><h1>${headerMessage}</h1></center>
</head>
<body>
	
	<h1>ENTER IRON DETAILS: </h1>
	
 <form:errors path="iron1.*" cssClass="error"/> 
 	
	<form:form method="post" action="addIron" >  
    <table border="1">  
    	<tr>
	     	<td>Iron Number: </td>
	     	<td><select name="ironNumber" id="ironNumber"></select></div></td>
		</tr>
    	<tr>
	     	<td>Loft: </td>
	     	<td><select name="loft" id="ironLoft"></select></div></td>
		</tr>
		<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer"/></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model"/></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer"/></td>
			
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel"/></td>
			
		</tr>
		<tr>
			<td>Shaft raw weight: </td>
			<td><input type="number" name="ShaftRawWeight" /></td>
							
		</tr>
		<tr>
			<td>Shaft Flex: </td>
			<td><input type="text" name="ShaftFlex" /></td>
		</tr>	
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" /></td>
		</tr>	
    </table> 
  	
  	<table>
     <tr>  
      <td><input type="submit" value="Add new Iron to Inventory" />  
      </td>  
     </tr> 
     </table> 
   </form:form>
	
	
	
	
</body>
</html>