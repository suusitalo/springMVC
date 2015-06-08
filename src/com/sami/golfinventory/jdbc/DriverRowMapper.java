package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Driver;

  
public class DriverRowMapper implements RowMapper<Driver> {  
  
 @Override  
 public Driver mapRow(ResultSet resultSet, int line) throws SQLException {  
  DriverExtractor driverExtractor = new DriverExtractor();  
  return driverExtractor.extractData(resultSet);  
 } 
	
}
