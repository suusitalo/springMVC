package com.sami.golfinventory.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import com.sami.golfinventory.domain.Wood;
 
  
public class WoodExtractor implements ResultSetExtractor<Wood> {  
  
 public Wood extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  Wood wood = new Wood();  
    
  wood.setWoodId(resultSet.getInt(1));
  wood.setWoodNumber(resultSet.getInt(2));
  wood.setManufacturer(resultSet.getString(3));
  wood.setModel(resultSet.getString(4));
  wood.setLoft(resultSet.getInt(5));
  wood.setShaftManufacturer(resultSet.getString(6));
  wood.setShaftModel(resultSet.getString(7));
  wood.setShaftRawWeight(resultSet.getInt(8));
  wood.setShaftFlex(resultSet.getString(9));
  wood.setGrip(resultSet.getString(10));
    
  return wood;  
 }  
}
