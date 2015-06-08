package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Driver;
import com.sami.golfinventory.jdbc.DriverRowMapper;

  
public class DriverDaoImplementation implements DriverDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Driver driver) {  
  
  String sql = "INSERT INTO drivers "  
    + "(manufacturer, model, loft, shaft_manufacturer, shaft_model, shaft_raw_weight, shaft_flex, grip ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { driver.getManufacturer(), driver.getModel(),  
      driver.getLoft(), driver.getShaftManufacturer(), driver.getShaftModel(), driver.getShaftRawWeight(), driver.getShaftFlex(), driver.getGrip() });  
  
 }  
  
 public List<Driver> getDriverList() {  
  List driverList = new ArrayList();  
  
  String sql = "select * from drivers";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  driverList = jdbcTemplate.query(sql, new DriverRowMapper());  
  return driverList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from drivers where driver_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Driver driver) {  
  
  String sql = "UPDATE drivers set manufacturer = ?, model = ?, loft = ?, shaft_manufacturer = ?, "
  		+ "shaft_model = ?, shaft_raw_weight = ?, shaft_flex = ?, grip = ? where driver_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { driver.getManufacturer(), driver.getModel(),  
    	      driver.getLoft(), driver.getShaftManufacturer(), driver.getShaftModel(), driver.getShaftRawWeight(), driver.getShaftFlex(), driver.getGrip(), driver.getDriverId() });  
  
 }  
  
 @Override  
 public Driver getDriver(String id) {  
  List<Driver> driverList = new ArrayList<Driver>();  
  String sql = "select * from drivers where driver_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  driverList = jdbcTemplate.query(sql, new DriverRowMapper());  
  return driverList.get(0);  
 }  
}
