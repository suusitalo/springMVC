<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script type="text/javascript">
	    	$(document).ready(function() {
	    		var wedgeLofts = [];
	    		for (i=0; i < 15; i++){
	    			wedgeLofts.push(i+50);
	    		}
	    		$("#wedgeLoft").find('option').remove();
	               	for (i=0; i < wedgeLofts.length; i++){
	               		$("#wedgeLoft").append('<option value="' + wedgeLofts[i]+ '">'+wedgeLofts[i]+'</option>');
	               	}
	            $("select#wedgeLoft").val("50");  
	            $("#bounce").find('option').remove();
	            for (i=2; i <= 14; i++){
               		$("#bounce").append('<option value="' + i+ '">'+i+'</option>');
               	}
            	$("select#bounce").val("2");
	        });	    
	        
	        
	    
	</script>
<html>
<head>
	<center><h1>${headerMessage}</h1></center>
</head>
<body>
	
	<h1>ENTER WEDGE DETAILS: </h1>
	
 <form:errors path="wedge1.*" cssClass="error"/> 
 	
	<form:form method="post" action="addWedge" >  
    <table border="1">  
    	<tr>
	     	<td>Loft: </td>
	     	<td><select name="loft" id="wedgeLoft"></select></div></td>
	    </tr> 	
		<tr>
			<td>Bounce: </td>
	     	<td><select name="bounce" id="bounce"></select></td>
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
			<td>Grip: </td>
			<td><input type="text" name="grip" /></td>
		</tr>
	</table> 
  	
  	<table>
     <tr>  
      <td><input type="submit" value="Add new Wedge to Inventory" />  
      </td>  
     </tr> 
     </table> 
   </form:form>
	
	
	
	
</body>
</html>