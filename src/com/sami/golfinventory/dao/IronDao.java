package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Iron;
  
public interface IronDao {  
 public void insertData(Iron iron);  
 public List<Iron> getIronList();  
 public void updateData(Iron iron);  
 public void deleteData(String id);  
 public Iron getIron(String id);  
  
}  