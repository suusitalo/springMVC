<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript">
		$(document).ready(function() {
			$("#shaftLength").find('option').remove();
	        for (i=20; i <= 38; i++){
	       		$("#shaftLength").append('<option value="' + i+ '">'+i+'</option>');
	       	}
	        var dbPutterLength = ${map.putter.shaftLength}
	    	$("select#shaftLength").val(dbPutterLength);
	    });	    
		    		
</script>        	
<html>  
<head>  
	<center><h1>${headerMessage}</h1></center>
</head>  
<body> 
	<h1>EDIT PUTTER DETAILS: </h1> 
 	
 	<form:errors path="putter1.*" cssClass="error"/> 
 
  <div>  
   <form:form method="post" action="updatePutter" modelAttribute="putter">  
    <table border="1">  
     	<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" value="${map.putter.manufacturer}" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" value="${map.putter.model}" /></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer" value="${map.putter.shaftManufacturer}" /></td>
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel" value="${map.putter.shaftModel}" /></td>
		</tr>
		<tr>
	     	<td>Shaft Length: </td>
	     	<td><select name="shaftLength" id="shaftLength" ></select></div></td>
	    </tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" value="${map.putter.grip}" /></td>					
		</tr>				
				
    </table> 
  	
  	<form:hidden path="putterId" value="${map.putter.putterId}" />  
  	 
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
   </form:form>  
  </div>  

</body>  
</html>  