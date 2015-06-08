package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Ball;
  
public interface BallDao {  
 public void insertData(Ball ball);  
 public List<Ball> getBallList();  
 public void updateData(Ball ball);  
 public void deleteData(String id);  
 public Ball getBall(String id);  
  
}  