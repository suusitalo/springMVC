package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;  

import com.sami.golfinventory.domain.Ball;

  
public class BallRowMapper implements RowMapper<Ball> {  
  
 @Override  
 public Ball mapRow(ResultSet resultSet, int line) throws SQLException {  
  BallExtractor ballExtractor = new BallExtractor();  
  return ballExtractor.extractData(resultSet);  
 } 
	
}
