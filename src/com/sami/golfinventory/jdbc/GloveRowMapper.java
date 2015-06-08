package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Glove;

  
public class GloveRowMapper implements RowMapper<Glove> {  
  
 @Override  
 public Glove mapRow(ResultSet resultSet, int line) throws SQLException {  
  GloveExtractor gloveExtractor = new GloveExtractor();  
  return gloveExtractor.extractData(resultSet);  
 } 
	
}
