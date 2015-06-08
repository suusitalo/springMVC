package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Wedge;

  
public class WedgeRowMapper implements RowMapper<Wedge> {  
  
 @Override  
 public Wedge mapRow(ResultSet resultSet, int line) throws SQLException {  
  WedgeExtractor wedgeExtractor = new WedgeExtractor();  
  return wedgeExtractor.extractData(resultSet);  
 } 
	
}
