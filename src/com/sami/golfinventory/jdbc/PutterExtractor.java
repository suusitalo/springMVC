package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Putter;
 
  
public class PutterExtractor implements ResultSetExtractor<Putter> {  
  
	 public Putter extractData(ResultSet resultSet) throws SQLException,  
	 DataAccessException {  
	    
		 Putter putter = new Putter();  
		    
		 putter.setPutterId(resultSet.getInt(1));
		 putter.setManufacturer(resultSet.getString(2));
		 putter.setModel(resultSet.getString(3));
		 putter.setShaftManufacturer(resultSet.getString(4));
		 putter.setShaftModel(resultSet.getString(5));
		 putter.setShaftLength(resultSet.getInt(6));
		 putter.setGrip(resultSet.getString(7));
		    
		 return putter;  
	 }  
}
