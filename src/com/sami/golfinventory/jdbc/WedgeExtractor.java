package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Wedge;
 
  
public class WedgeExtractor implements ResultSetExtractor<Wedge> {  
  
	 public Wedge extractData(ResultSet resultSet) throws SQLException,  
	 DataAccessException {  
	    
		 Wedge wedge = new Wedge();  
		    
		 wedge.setWedgeId(resultSet.getInt(1));
		 wedge.setManufacturer(resultSet.getString(2));
		 wedge.setModel(resultSet.getString(3));
		 wedge.setLoft(resultSet.getInt(4));
		 wedge.setBounce(resultSet.getInt(5));
		 wedge.setShaftManufacturer(resultSet.getString(6));
		 wedge.setShaftModel(resultSet.getString(7));
		 wedge.setShaftRawWeight(resultSet.getInt(8));
		 wedge.setGrip(resultSet.getString(9));
		    
		 return wedge;  
	 }  
}
