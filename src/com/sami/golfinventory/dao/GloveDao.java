package com.sami.golfinventory.dao;

import java.util.List;  

import com.sami.golfinventory.domain.Glove;
  
public interface GloveDao {  
 public void insertData(Glove glove);  
 public List<Glove> getGloveList();  
 public void updateData(Glove glove);  
 public void deleteData(String id);  
 public Glove getGlove(String id);  
  
}  