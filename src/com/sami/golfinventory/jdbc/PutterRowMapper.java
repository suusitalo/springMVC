package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Putter;

  
public class PutterRowMapper implements RowMapper<Putter> {  
  
 @Override  
 public Putter mapRow(ResultSet resultSet, int line) throws SQLException {  
  PutterExtractor putterExtractor = new PutterExtractor();  
  return putterExtractor.extractData(resultSet);  
 } 
	
}
