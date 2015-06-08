package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Putter;
  
public interface PutterDao {  
 public void insertData(Putter putter);  
 public List<Putter> getPutterList();  
 public void updateData(Putter putter);  
 public void deleteData(String id);  
 public Putter getPutter(String id);  
  
}  