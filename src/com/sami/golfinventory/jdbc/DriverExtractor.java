package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Driver;
 
  
public class DriverExtractor implements ResultSetExtractor<Driver> {  
  
	 public Driver extractData(ResultSet resultSet) throws SQLException,  
	 DataAccessException {  
	    
		 Driver driver = new Driver();  
		    
		 driver.setDriverId(resultSet.getInt(1));
		 driver.setManufacturer(resultSet.getString(2));
		 driver.setModel(resultSet.getString(3));
		 driver.setLoft(resultSet.getInt(4));
		 driver.setShaftManufacturer(resultSet.getString(5));
		 driver.setShaftModel(resultSet.getString(6));
		 driver.setShaftRawWeight(resultSet.getInt(7));
		 driver.setShaftFlex(resultSet.getString(8));
		 driver.setGrip(resultSet.getString(9));
		    
		 return driver;  
	 }  
}
