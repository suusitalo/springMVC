package com.sami.golfinventory.services;

import java.util.List;  
  




import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.GloveDao;
import com.sami.golfinventory.domain.Glove;
 
  
  
public class GloveServiceImplementation implements GloveService {  
  
 @Autowired  
 GloveDao glovedao;  
  
 @Override  
 public void insertData(Glove glove) {  
  glovedao.insertData(glove);  
 }  
  
 @Override  
 public List<Glove> getGloveList() {  
  return glovedao.getGloveList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  glovedao.deleteData(id);  
    
 }  
  
 @Override  
 public Glove getGlove(String id) {  
  return glovedao.getGlove(id);  
 }  
  
 @Override  
 public void updateData(Glove glove) {  
  glovedao.updateData(glove);  
    
 }  
}
