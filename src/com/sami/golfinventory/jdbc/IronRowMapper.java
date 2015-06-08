package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Iron;

  
public class IronRowMapper implements RowMapper<Iron> {  
  
 @Override  
 public Iron mapRow(ResultSet resultSet, int line) throws SQLException {  
  IronExtractor ironExtractor = new IronExtractor();  
  return ironExtractor.extractData(resultSet);  
 } 
	
}
