package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Putter;
import com.sami.golfinventory.jdbc.PutterRowMapper;

  
public class PutterDaoImplementation implements PutterDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Putter putter) {  
  
  String sql = "INSERT INTO putters "  
    + "(manufacturer, model, shaft_manufacturer, shaft_model, shaft_length, grip ) VALUES (?, ?, ?, ?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { putter.getManufacturer(), putter.getModel(),  
      putter.getShaftManufacturer(), putter.getShaftModel(), putter.getShaftLength(), putter.getGrip() });  
  
 }  
  
 public List<Putter> getPutterList() {  
  List putterList = new ArrayList();  
  
  String sql = "select * from putters";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  putterList = jdbcTemplate.query(sql, new PutterRowMapper());  
  return putterList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from putters where putter_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Putter putter) {  
  
  String sql = "UPDATE putters set manufacturer = ?, model = ?, shaft_manufacturer = ?, "
  		+ "shaft_model = ?, shaft_length = ?, grip = ? where putter_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { putter.getManufacturer(), putter.getModel(),  
    	      putter.getShaftManufacturer(), putter.getShaftModel(), putter.getShaftLength(), putter.getGrip(), putter.getPutterId() });  
  
 }  
  
 @Override  
 public Putter getPutter(String id) {  
  List<Putter> putterList = new ArrayList<Putter>();  
  String sql = "select * from putters where putter_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  putterList = jdbcTemplate.query(sql, new PutterRowMapper());  
  return putterList.get(0);  
 }  
}
