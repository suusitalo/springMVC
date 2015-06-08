<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript">
	    	$(document).ready(function() {
	    		var putterLofts = [];
	    		for (i=2; i < 10; i++){
	    			putterLofts.push(i);
	    		}
	    		$("#putterLoft").find('option').remove();
	               	for (i=0; i < putterLofts.length; i++){
	               		$("#putterLoft").append('<option value="' + putterLofts[i]+ '">'+putterLofts[i]+'</option>');
	               	}
	            $("select#putterLoft").val("2");  
	            $("#shaftLength").find('option').remove();
	            for (i=20; i <= 38; i++){
               		$("#shaftLength").append('<option value="' + i+ '">'+i+'</option>');
               	}
            	$("select#shaftLength").val("20");
	        });	    
	        
	        
	    
</script>
<html>
<head>
</head>
<body>
	<center><h1>${headerMessage}</h1></center>
	<h1>ENTER PUTTER DETAILS: </h1>
	
 <form:errors path="putter1.*" cssClass="error"/> 
 	
	<form:form method="post" action="addPutter" >  
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
			<td>Shaft Manufacturer: </td>
			<td><input type="text" name="shaftManufacturer"/></td>
			
		</tr>
		<tr>
			<td>Shaft Model: </td>
			<td><input type="text" name="ShaftModel"/></td>
			
		</tr>
		<tr>
			<td>Shaft Length: </td>
	     	<td><select name="shaftLength" id="shaftLength"></select></td>
		</tr>
		<tr>
			<td>Grip: </td>
			<td><input type="text" name="grip" /></td>
		</tr>
	</table> 
  	
  	<table>
     <tr>  
      <td><input type="submit" value="Add new Putter to Inventory" />  
      </td>  
     </tr> 
     </table> 
   </form:form>
	
	
	
	
</body>
</html>