package com.sami.golfinventory.services;

import java.util.List;  
  




import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.DriverDao;
import com.sami.golfinventory.domain.Driver;
 
  
  
public class DriverServiceImplementation implements DriverService {  
  
 @Autowired  
 DriverDao driverdao;  
  
 @Override  
 public void insertData(Driver driver) {  
  driverdao.insertData(driver);  
 }  
  
 @Override  
 public List<Driver> getDriverList() {  
  return driverdao.getDriverList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  driverdao.deleteData(id);  
    
 }  
  
 @Override  
 public Driver getDriver(String id) {  
  return driverdao.getDriver(id);  
 }  
  
 @Override  
 public void updateData(Driver driver) {  
  driverdao.updateData(driver);  
    
 }  
}
