package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Wood;
  
public interface WoodDao {  
 public void insertData(Wood wood);  
 public List<Wood> getWoodList();  
 public void updateData(Wood wood);  
 public void deleteData(String id);  
 public Wood getWood(String id);  
  
}
