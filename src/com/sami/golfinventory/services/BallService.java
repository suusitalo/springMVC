package com.sami.golfinventory.services;

import java.util.List;  

import com.sami.golfinventory.domain.Ball;
 
  
public interface BallService {  
  
 public void insertData(Ball ball);  
 public List<Ball> getBallList();  
 public void deleteData(String id);  
 public Ball getBall(String id);  
 public void updateData(Ball ball);  
}
