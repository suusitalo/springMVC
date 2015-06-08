package com.sami.golfinventory.services;

import java.util.List;  

import com.sami.golfinventory.domain.Putter;
 
  
public interface PutterService {  
  
 public void insertData(Putter putter);  
 public List<Putter> getPutterList();  
 public void deleteData(String id);  
 public Putter getPutter(String id);  
 public void updateData(Putter putter);  
}
