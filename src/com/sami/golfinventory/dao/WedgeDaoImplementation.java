package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Wedge;
import com.sami.golfinventory.jdbc.WedgeRowMapper;

  
public class WedgeDaoImplementation implements WedgeDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Wedge wedge) {  
  
  String sql = "INSERT INTO wedges "  
    + "(manufacturer, model, loft, bounce, shaft_manufacturer, shaft_model, shaft_raw_weight, grip ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { wedge.getManufacturer(), wedge.getModel(),  
      wedge.getLoft(), wedge.getBounce(), wedge.getShaftManufacturer(), wedge.getShaftModel(), wedge.getShaftRawWeight(), wedge.getGrip() });  
  
 }  
  
 public List<Wedge> getWedgeList() {  
  List wedgeList = new ArrayList();  
  
  String sql = "select * from wedges";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  wedgeList = jdbcTemplate.query(sql, new WedgeRowMapper());  
  return wedgeList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from wedges where wedge_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Wedge wedge) {  
  
  String sql = "UPDATE wedges set manufacturer = ?, model = ?, loft = ?, bounce = ?, shaft_manufacturer = ?, "
  		+ "shaft_model = ?, shaft_raw_weight = ?, grip = ? where wedge_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { wedge.getManufacturer(), wedge.getModel(),  
    	      wedge.getLoft(), wedge.getBounce(), wedge.getShaftManufacturer(), wedge.getShaftModel(), wedge.getShaftRawWeight(), wedge.getGrip(), wedge.getWedgeId() });  
  
 }  
  
 @Override  
 public Wedge getWedge(String id) {  
  List<Wedge> wedgeList = new ArrayList<Wedge>();  
  String sql = "select * from wedges where wedge_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  wedgeList = jdbcTemplate.query(sql, new WedgeRowMapper());  
  return wedgeList.get(0);  
 }  
}
