$(document).ready(function() {
		var driverLofts = [4,5,6,7,8,9,10];
	    		
		$("#driverLoft").find('option').remove();
	   	for (i=0; i < driverLofts.length; i++){
	   		$("#driverLoft").append('<option value="' + driverLofts[i]+ '">'+driverLofts[i]+'</option>');
	   	}
	});	   