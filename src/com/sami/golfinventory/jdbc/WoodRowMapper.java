package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Wood;

  
public class WoodRowMapper implements RowMapper<Wood> {  
  
 @Override  
 public Wood mapRow(ResultSet resultSet, int line) throws SQLException {  
  WoodExtractor woodExtractor = new WoodExtractor();  
  return woodExtractor.extractData(resultSet);  
 } 
	
}
