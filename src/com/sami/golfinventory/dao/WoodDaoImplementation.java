package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Wood;
import com.sami.golfinventory.jdbc.WoodRowMapper;

  
public class WoodDaoImplementation implements WoodDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Wood wood) {  
  
  String sql = "INSERT INTO woods "  
    + "(wood_number, manufacturer, model, loft, shaft_manufacturer, shaft_model, shaft_raw_weight, shaft_flex, grip ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { wood.getWoodNumber(), wood.getManufacturer(), wood.getModel(),  
      wood.getLoft(), wood.getShaftManufacturer(), wood.getShaftModel(), wood.getShaftRawWeight(), wood.getShaftFlex(), wood.getGrip() });  
  
 }  
  
 public List<Wood> getWoodList() {  
  List woodList = new ArrayList();  
  
  String sql = "select * from woods";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  woodList = jdbcTemplate.query(sql, new WoodRowMapper());  
  return woodList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from woods where wood_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Wood wood) {  
  
  String sql = "UPDATE woods set wood_number = ?, manufacturer = ?, model = ?, loft = ?, shaft_manufacturer = ?, "
  		+ "shaft_model = ?, shaft_raw_weight = ?, shaft_flex = ?, grip = ? where wood_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { wood.getWoodNumber(), wood.getManufacturer(), wood.getModel(),  
    	      wood.getLoft(), wood.getShaftManufacturer(), wood.getShaftModel(), wood.getShaftRawWeight(), wood.getShaftFlex(), wood.getGrip(), wood.getWoodId() });  
  
 }  
  
 @Override  
 public Wood getWood(String id) {  
  List<Wood> woodList = new ArrayList<Wood>();  
  String sql = "select * from woods where wood_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  woodList = jdbcTemplate.query(sql, new WoodRowMapper());  
  return woodList.get(0);  
 }  
}
