package com.sami.golfinventory.services;

import java.util.List;  

import com.sami.golfinventory.domain.Driver;
 
  
public interface DriverService {  
  
 public void insertData(Driver driver);  
 public List<Driver> getDriverList();  
 public void deleteData(String id);  
 public Driver getDriver(String id);  
 public void updateData(Driver driver);  
}
