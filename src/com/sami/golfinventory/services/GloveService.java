package com.sami.golfinventory.services;

import java.util.List;  

import com.sami.golfinventory.domain.Glove;
 
  
public interface GloveService {  
  
 public void insertData(Glove glove);  
 public List<Glove> getGloveList();  
 public void deleteData(String id);  
 public Glove getGlove(String id);  
 public void updateData(Glove glove);  
}
