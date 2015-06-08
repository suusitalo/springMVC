package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Wedge;
  
public interface WedgeDao {  
 public void insertData(Wedge wedge);  
 public List<Wedge> getWedgeList();  
 public void updateData(Wedge wedge);  
 public void deleteData(String id);  
 public Wedge getWedge(String id);  
  
}  