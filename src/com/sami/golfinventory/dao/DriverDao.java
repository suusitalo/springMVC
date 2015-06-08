package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Driver;
  
public interface DriverDao {  
 public void insertData(Driver driver);  
 public List<Driver> getDriverList();  
 public void updateData(Driver driver);  
 public void deleteData(String id);  
 public Driver getDriver(String id);  
  
}  