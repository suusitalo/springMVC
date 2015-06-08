package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Iron;
import com.sami.golfinventory.jdbc.IronRowMapper;

  
public class IronDaoImplementation implements IronDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Iron iron) {  
  
  String sql = "INSERT INTO irons "  
    + "(ironNumber, manufacturer, model, loft, shaft_manufacturer, shaft_model, shaft_raw_weight, shaft_flex, grip ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { iron.getIronNumber(), iron.getManufacturer(), iron.getModel(),  
      iron.getLoft(), iron.getShaftManufacturer(), iron.getShaftModel(), iron.getShaftRawWeight(), iron.getShaftFlex(), iron.getGrip() });  
  
 }  
  
 public List<Iron> getIronList() {  
  List ironList = new ArrayList();  
  
  String sql = "select * from irons";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  ironList = jdbcTemplate.query(sql, new IronRowMapper());  
  return ironList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from irons where iron_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Iron iron) {  
  
  String sql = "UPDATE irons set ironNumber = ?, manufacturer = ?, model = ?, loft = ?, shaft_manufacturer = ?, "
  		+ "shaft_model = ?, shaft_raw_weight = ?, shaft_flex = ?, grip = ? where iron_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { iron.getIronNumber(), iron.getManufacturer(), iron.getModel(),  
    	      iron.getLoft(), iron.getShaftManufacturer(), iron.getShaftModel(), iron.getShaftRawWeight(), iron.getShaftFlex(), iron.getGrip(), iron.getIronId() });  
  
 }  
  
 @Override  
 public Iron getIron(String id) {  
  List<Iron> ironList = new ArrayList<Iron>();  
  String sql = "select * from irons where iron_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  ironList = jdbcTemplate.query(sql, new IronRowMapper());  
  return ironList.get(0);  
 }  
}
