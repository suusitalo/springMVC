package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Glove;
 
  
public class GloveExtractor implements ResultSetExtractor<Glove> {  
  
	 public Glove extractData(ResultSet resultSet) throws SQLException,  
	 DataAccessException {  
	    
		 Glove glove = new Glove();  
		    
		 glove.setGloveId(resultSet.getInt(1));
		 glove.setManufacturer(resultSet.getString(2));
		 glove.setModel(resultSet.getString(3));
		 glove.setSize(resultSet.getString(4));
		 glove.setAmount(resultSet.getInt(5));
		    
		 return glove;  
	 }  
}
