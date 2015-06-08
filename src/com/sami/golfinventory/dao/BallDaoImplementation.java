package com.sami.golfinventory.dao;

import java.util.ArrayList;  
import java.util.List;  

import javax.sql.DataSource;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  

import com.sami.golfinventory.domain.Ball;
import com.sami.golfinventory.jdbc.BallRowMapper;

  
public class BallDaoImplementation implements BallDao {  
  
 @Autowired  
 DataSource dataSource;  
  
 public void insertData(Ball ball) {  
  
  String sql = "INSERT INTO balls "  
    + "(manufacturer, model, amount) VALUES (?, ?, ?)";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { ball.getManufacturer(), ball.getModel(),  
      ball.getAmount() });  
  
 }  
  
 public List<Ball> getBallList() {  
  List ballList = new ArrayList();  
  
  String sql = "select * from balls";  
  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  ballList = jdbcTemplate.query(sql, new BallRowMapper());  
  return ballList;  
 }  
  
 @Override  
 public void deleteData(String id) {  
  String sql = "delete from balls where ball_id=" + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  jdbcTemplate.update(sql);  
  
 }  
  
 @Override  
 public void updateData(Ball ball) {  
  
  String sql = "UPDATE balls set manufacturer = ?, model = ?, amount = ? where ball_id = ?";  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  
  jdbcTemplate.update(  
    sql,  
    new Object[] { ball.getManufacturer(), ball.getModel(),  
    	      ball.getAmount(), ball.getBallId() });  
  
 }  
  
 @Override  
 public Ball getBall(String id) {  
  List<Ball> ballList = new ArrayList<Ball>();  
  String sql = "select * from balls where ball_id= " + id;  
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
  ballList = jdbcTemplate.query(sql, new BallRowMapper());  
  return ballList.get(0);  
 }  
}
