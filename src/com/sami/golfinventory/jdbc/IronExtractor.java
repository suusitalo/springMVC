package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Iron;
 
  
public class IronExtractor implements ResultSetExtractor<Iron> {  
  
	 public Iron extractData(ResultSet resultSet) throws SQLException,  
	 DataAccessException {  
	    
		 Iron iron = new Iron();  
		    
		 iron.setIronId(resultSet.getInt(1));
		 iron.setIronNumber(resultSet.getInt(2));
		 iron.setManufacturer(resultSet.getString(3));
		 iron.setModel(resultSet.getString(4));
		 iron.setLoft(resultSet.getInt(5));
		 iron.setShaftManufacturer(resultSet.getString(6));
		 iron.setShaftModel(resultSet.getString(7));
		 iron.setShaftRawWeight(resultSet.getInt(8));
		 iron.setShaftFlex(resultSet.getString(9));
		 iron.setGrip(resultSet.getString(10));
		    
		 return iron;  
	 }  
}
