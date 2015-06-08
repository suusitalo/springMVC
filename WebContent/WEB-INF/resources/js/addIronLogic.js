$(document).ready(function() {
		var ironLofts = [];
	    for (i=0; i < 35; i++){
	    	ironLofts.push(i+15);
	    }
	    for (i=0; i < 4; i++){
        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
        }
	    $("#ironNumber").find('option').remove();
        for (i=1; i <= 9; i++){
        	$("#ironNumber").append('<option value="' + i+ '">'+i+'</option>');
        }
        $("select#ironNumber").val("1");
	    $("select#ironLoft").val("15");
	    $("#ironNumber").change(function(){
		    var selectedIron = $('#ironNumber :selected').text();
		            	
		    if (selectedIron=="1"){
		    	$("#ironLoft").find('option').remove();
		        for (i=0; i < 4; i++){
		        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }if (selectedIron=="2"){
		    	$("#ironLoft").find('option').remove();
		       	for (i=0; i < 4; i++){
		      		$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		       	}
		    }if (selectedIron=="3"){
		    	$("#ironLoft").find('option').remove();
		    	for (i=2; i < 6; i++){
		        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }if (selectedIron=="4"){
		    	$("#ironLoft").find('option').remove();
		    	for (i=6; i < 11; i++){
		        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }if (selectedIron=="5"){
		    	$("#ironLoft").find('option').remove();
		        for (i=11; i < 16; i++){
		        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }if (selectedIron=="6"){
		    	$("#ironLoft").find('option').remove();
		        for (i=16; i < 21; i++){
		        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }if (selectedIron=="7"){
		    	$("#ironLoft").find('option').remove();
		        for (i=21; i < 26; i++){
		        	$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }if (selectedIron=="8"){
		    	$("#ironLoft").find('option').remove();
		       	for (i=26; i < 31; i++){
		       		$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		       	}
		    }if (selectedIron=="9"){
		    	$("#ironLoft").find('option').remove();
		       	for (i=31; i < 35; i++){
		    		$("#ironLoft").append('<option value="' + ironLofts[i]+ '">'+ironLofts[i]+'</option>');
		        }
		    }
	    });
	});	    