package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Ball;
 
  
public class BallExtractor implements ResultSetExtractor<Ball> {  
  
	 public Ball extractData(ResultSet resultSet) throws SQLException,  
	 DataAccessException {  
	    
		 Ball ball = new Ball();  
		    
		 ball.setBallId(resultSet.getInt(1));
		 ball.setManufacturer(resultSet.getString(2));
		 ball.setModel(resultSet.getString(3));
		 ball.setAmount(resultSet.getInt(4));
		    
		 return ball;  
	 }  
}
