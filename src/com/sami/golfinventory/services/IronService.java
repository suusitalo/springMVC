package com.sami.golfinventory.services;

import java.util.List;  

import com.sami.golfinventory.domain.Iron;
 
  
public interface IronService {  
  
 public void insertData(Iron iron);  
 public List<Iron> getIronList();  
 public void deleteData(String id);  
 public Iron getIron(String id);  
 public void updateData(Iron iron);  
}
