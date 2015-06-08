package com.sami.golfinventory.services;

import java.util.List;  
  




import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.BallDao;
import com.sami.golfinventory.domain.Ball;
 
  
  
public class BallServiceImplementation implements BallService {  
  
 @Autowired  
 BallDao balldao;  
  
 @Override  
 public void insertData(Ball ball) {  
  balldao.insertData(ball);  
 }  
  
 @Override  
 public List<Ball> getBallList() {  
  return balldao.getBallList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  balldao.deleteData(id);  
    
 }  
  
 @Override  
 public Ball getBall(String id) {  
  return balldao.getBall(id);  
 }  
  
 @Override  
 public void updateData(Ball ball) {  
  balldao.updateData(ball);  
    
 }  
}
