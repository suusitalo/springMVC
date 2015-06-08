package com.sami.golfinventory.services;

import java.util.List;  

import com.sami.golfinventory.domain.Wedge;
 
  
public interface WedgeService {  
  
 public void insertData(Wedge wedge);  
 public List<Wedge> getWedgeList();  
 public void deleteData(String id);  
 public Wedge getWedge(String id);  
 public void updateData(Wedge wedge);  
}
