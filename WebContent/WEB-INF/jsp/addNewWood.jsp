<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script type="text/javascript">
	    	$(document).ready(function() {
	    		var woodNumbers = [2,3,4,5];
	    		var woodLofts = [13,14,15,16,17,18,19,20,21];
	    		
	    		$("#woodNumber").find('option').remove();
			    for (i=0; i < woodNumbers.length; i++){
            		$("#woodNumber").append('<option id="'+ woodNumbers[i]+ ' value="' + woodNumbers[i]+ '">'+woodNumbers[i]+'</option>');
            	}
			    for (i=0; i < 2; i++){
            		$("#woodLoft").append('<option value="' + woodLofts[i]+ '">'+woodLofts[i]+'</option>');
            	}
			    $("select#woodNumber").val("2");
	    		$("#woodNumber").change(function(){
	            	var selectedWood = $('#woodNumber :selected').text();
	            	
	            	if (selectedWood=="2"){
	    	 			$("#woodLoft").find('option').remove();
	                	for (i=0; i < 2; i++){
	                		$("#woodLoft").append('<option value="' + woodLofts[i]+ '">'+woodLofts[i]+'</option>');
	                	}
	    	 		}if (selectedWood=="3"){
	    	 			$("#woodLoft").find('option').remove();
	                	for (i=0; i < 4; i++){
	                		$("#woodLoft").append('<option value="' + woodLofts[i]+ '">'+woodLofts[i]+'</option>');
	                	}
	    	 		}if (selectedWood=="4"){
	    	 			$("#woodLoft").find('option').remove();
	                	for (i=3; i < 6; i++){
	                		$("#woodLoft").append('<option value="' + woodLofts[i]+ '">'+woodLofts[i]+'</option>');
	                	}
	    	 		}if (selectedWood=="5"){
	    	 			$("#woodLoft").find('option').remove();
	                	for (i=6; i < woodLofts.length; i++){
	                		$("#woodLoft").append('<option value="' + woodLofts[i]+ '">'+woodLofts[i]+'</option>');
	                	}
	    	 		}
	    	 		
            	});
	    	});
	 </script>     
<html>  
<head>  
	<center><h1>${headerMessage}</h1></center>
</head>  
<body>  
 <H1>ENTER WOOD DETAILS</h1>  
 
  <form:errors path="wood1.*" cssClass="error"/> 
  
   	<form:form method="post" action="addWood" >  
    <table border="1"> 
    	
     	<tr>
	     	<td>Number : </td>
	     	<td><select name="woodNumber" id="woodNumber"></select></td>
	    </tr>
	    <tr>
			<td>Wood Loft: </td>
			<td><select name="loft" id="woodLoft" ></select></td>
		</tr>
		<tr>
			<td>Manufacturer: </td>
			<td><input type="text" name="manufacturer" /></td>
		</tr>
		<tr>
			<td>Model: </td>
			<td><input type="text" name="model" /></td>
		</tr>
		<tr>
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer"/></td>
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel" /></td>
		</tr>
		<tr>
			<td>Shaft raw weight: </td>
			<td><input type="number" name="shaftRawWeight" /></td>
		</tr>
		<tr>
			<td>Shaft Flex: </td>
			<td><input type="text" name="shaftFlex"/></td>	
		</tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" /></td>
		</tr>				
	</table> 
	<table>
		<tr>  
      		<td><input type="submit" value="Add new Wood to Inventory" />  </td>  
     	</tr>
    </table>  
   </form:form>  
</body>  
</html>  