package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Glove;
import com.sami.golfinventory.jdbc.GloveRowMapper;

  
public class GloveDaoImplementation implements GloveDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Glove glove) {  
  
  String sql = "INSERT INTO gloves "  
    + "(manufacturer, model, size, amount ) VALUES (?, ?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { glove.getManufacturer(), glove.getModel(),  
      glove.getSize(), glove.getAmount() });  
  
 }  
  
 public List<Glove> getGloveList() {  
  List gloveList = new ArrayList();  
  
  String sql = "select * from gloves";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  gloveList = jdbcTemplate.query(sql, new GloveRowMapper());  
  return gloveList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from gloves where glove_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Glove glove) {  
  
  String sql = "UPDATE gloves set manufacturer = ?, model = ?, size = ?, amount = ? where glove_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { glove.getManufacturer(), glove.getModel(),  
    	      glove.getSize(), glove.getAmount(), glove.getGloveId() });  
  
 }  
  
 @Override  
 public Glove getGlove(String id) {  
  List<Glove> gloveList = new ArrayList<Glove>();  
  String sql = "select * from gloves where glove_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  gloveList = jdbcTemplate.query(sql, new GloveRowMapper());  
  return gloveList.get(0);  
 }  
}
