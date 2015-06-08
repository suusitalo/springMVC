<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
 pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<c:set scope="session" value="${pageContext.request.contextPath}" var="cp"></c:set>
<link rel="stylesheet" href="${cp}/css/style.css" type="text/css"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${cp}/js/stickUp.min.js"></script>

<html>
<head>
	 <!-- START THE NAVBAR -->
             <center>
              <ul class="menuContainer">
                <li class="menuItem active"><a href="#drivers">Drivers</a></li>
                <li class="menuItem"><a href="#woods">Woods</a></li>
                <li class="menuItem"><a href="#irons">Irons</a></li>
                <li class="menuItem"><a href="#wedges">Wedges</a></li>
                <li class="menuItem"><a href="#putters">Putters</a></li>
                <li class="menuItem"><a href="#balls">Balls</a></li>
                <li class="menuItem"><a href="#gloves">Gloves</a></li>
                <li class="menuItem"><a href="#contact">Contact</a></li>
              </ul>
              </center>
      <!-- END NAVBAR -->
<div class="content" ><!-- content --> 
<body>  
	<center><h1>${headerMessage}</h1></center>
</head>
</div> 

 
 <center>
	<h2>Golf Clubs</h2>	
	<!-- DRIVERS -->
  <div id="drivers" ></div> 
  <h3>Drivers </h3>
  <table border="1">  
   <tr>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Loft</td>  
    <td class="heading">Shaft Manufacturer</td>  
    <td class="heading">Shaft Model</td>  
    <td class="heading">Shaft Raw weight</td>  
    <td class="heading">Shaft Flex</td>
    <td class="heading">Grip</td>
   	<td class="heading">Edit</td>  
    <td class="heading">Delete</td>  
   </tr>  
   <c:forEach var="driver" items="${model.driverList}">  
    <tr>  
     <td>${driver.manufacturer}</td>  
     <td>${driver.model}</td>  
     <td>${driver.loft}</td>  
     <td>${driver.shaftManufacturer}</td>  
     <td>${driver.shaftModel}</td>  
     <td>${driver.shaftRawWeight}</td>  
     <td>${driver.shaftFlex}</td>
     <td>${driver.grip}</td>
     <td><a href="editDriver?id=${driver.driverId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deleteDriver?id=${driver.driverId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="10"><a href="addNewDriver"><button class="addButton">Add New Driver</button></a></td></tr>  
  </table>  
  <!-- WOODS -->
  <div id="woods" ></div>
  <h3>Woods </h3>  
  <table border="1">  
   <tr>  
    <td class="heading">Wood Number</td>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Loft</td>  
    <td class="heading">Shaft Manufacturer</td>  
    <td class="heading">Shaft Model</td>  
    <td class="heading">Shaft Raw weight</td>  
    <td class="heading">Shaft Flex</td>
    <td class="heading">Grip</td>
   	<td class="heading">Edit</td>  
    <td class="heading">Delete</td>   
   </tr>  
   <c:forEach var="wood" items="${model.woodList}">  
    <tr>  
     <td>${wood.woodNumber}</td>  
     <td>${wood.manufacturer}</td>  
     <td>${wood.model}</td>  
     <td>${wood.loft}</td>  
     <td>${wood.shaftManufacturer}</td>  
     <td>${wood.shaftModel}</td>  
     <td>${wood.shaftRawWeight}</td>  
     <td>${wood.shaftFlex}</td>
     <td>${wood.grip}</td>
     <td><a href="editWood?id=${wood.woodId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deleteWood?id=${wood.woodId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="11"><a href="addNewWood"><button class="addButton">Add New Wood</button></a></td></tr>  
  </table>  
  <!-- IRONS -->
  <div id="irons"></div>
  <h3>Irons </h3>  
  <table border="1">  
   <tr>  
    <td class="heading">Iron Number</td>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Loft</td>  
    <td class="heading">Shaft Manufacturer</td>  
    <td class="heading">Shaft Model</td>  
    <td class="heading">Shaft Raw weight</td>  
    <td class="heading">Shaft Flex</td>
    <td class="heading">Grip</td>
    <td class="heading">Edit</td>  
    <td class="heading">Delete</td>   
   </tr>  
   <c:forEach var="iron" items="${model.ironList}">  
    <tr>  
     <td>${iron.ironNumber}</td>  
     <td>${iron.manufacturer}</td>  
     <td>${iron.model}</td>  
     <td>${iron.loft}</td>  
     <td>${iron.shaftManufacturer}</td>  
     <td>${iron.shaftModel}</td>  
     <td>${iron.shaftRawWeight}</td>  
     <td>${iron.shaftFlex}</td>
     <td>${iron.grip}</td>
     <td><a href="editIron?id=${iron.ironId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deleteIron?id=${iron.ironId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="11"><a href="addNewIron"><button class="addButton">Add New Iron</button></a></td></tr>  
  </table>  
  <!-- WEDGES -->
  <div id="wedges"></div>
  <h3>Wedges </h3>  
  <table border="1">  
   <tr>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Loft</td>  
    <td class="heading">Bounce</td>  
    <td class="heading">Shaft Manufacturer</td>  
    <td class="heading">Shaft Model</td>  
    <td class="heading">Shaft Raw weight</td>  
    <td class="heading">Grip</td>
    <td class="heading">Edit</td>  
    <td class="heading">Delete</td>   
   </tr>  
   <c:forEach var="wedge" items="${model.wedgeList}">  
    <tr>  
     <td>${wedge.manufacturer}</td>  
     <td>${wedge.model}</td>  
     <td>${wedge.loft}</td>  
     <td>${wedge.bounce}</td>  
     <td>${wedge.shaftManufacturer}</td>  
     <td>${wedge.shaftModel}</td>  
     <td>${wedge.shaftRawWeight}</td>  
     <td>${wedge.grip}</td>
     <td><a href="editWedge?id=${wedge.wedgeId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deleteWedge?id=${wedge.wedgeId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="10"><a href="addNewWedge"><button class="addButton">Add New Wedge</button></a></td></tr>  
  </table>  
  <!-- PUTTERS -->
  <div id="putters"></div>
  <h3>Putters </h3>  
  <table border="1">  
   <tr>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Shaft Manufacturer</td>  
    <td class="heading">Shaft Model</td>  
    <td class="heading">Shaft Length</td>  
    <td class="heading">Grip</td>
    <td class="heading">Edit</td>  
    <td class="heading">Delete</td>   
   </tr>  
   <c:forEach var="putter" items="${model.putterList}">  
    <tr>  
     <td>${putter.manufacturer}</td>  
     <td>${putter.model}</td>  
     <td>${putter.shaftManufacturer}</td>  
     <td>${putter.shaftModel}</td>  
     <td>${putter.shaftLength}</td>  
     <td>${putter.grip}</td>
     <td><a href="editPutter?id=${putter.putterId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deletePutter?id=${putter.putterId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="8"><a href="addNewPutter"><button class="addButton">Add New Putter</button></a></td></tr>  
  </table>  
  
  <!-- BALLS -->
  <div id="balls"></div>
  <h3>Balls </h3>  
  <table border="1">  
   <tr>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Amount</td>
    <td class="heading">Edit</td>  
    <td class="heading">Delete</td>   
   </tr>  
   <c:forEach var="ball" items="${model.ballList}">  
    <tr>  
     <td>${ball.manufacturer}</td>  
     <td>${ball.model}</td>  
     <td>${ball.amount}</td>  
     <td><a href="editBall?id=${ball.ballId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deleteBall?id=${ball.ballId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="5"><a href="addNewBall"><button class="addButton">Add New Ball</button></a></td></tr>  
  </table>  
  <!-- GLOVES -->
  <div id="gloves"></div>
  <h3>Golf Gloves </h3>  
  <table border="1">  
   <tr>  
    <td class="heading">Manufacturer</td>  
    <td class="heading">Model</td>  
    <td class="heading">Size</td>  
    <td class="heading">Amount</td>  
    <td class="heading">Edit</td>  
    <td class="heading">Delete</td>   
   </tr>  
   <c:forEach var="glove" items="${model.gloveList}">  
    <tr>  
     <td>${glove.manufacturer}</td>  
     <td>${glove.model}</td>  
     <td>${glove.size}</td>  
     <td>${glove.amount}</td>  
     <td><a href="editGlove?id=${glove.gloveId}"><button class="editButton">Edit</button></a></td>  
     <td><a href="deleteGlove?id=${glove.gloveId}"><button class="deleteButton">Delete</button></a></td>  
    </tr>  
   </c:forEach>  
   <tr><td colspan="6"><a href="addNewGlove"><button class="addButton">Add New Glove</button></a></td></tr>  
  </table> 
  <table>
  	<div id="contact"></div>
  	<h3>Contact Information</h3>
  	<table border="1">  
   	<tr>  
	    <td>Email:</td>  
	    <td>suusitalo76 (a) gmail.com </td>  
  	</tr>
  	
  </table> 
 </center> 
</div> <!-- content --> 
</body>  
</html>  