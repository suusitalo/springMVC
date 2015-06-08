package com.sami.golfinventory.services;

import java.util.List;  
  




import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.PutterDao;
import com.sami.golfinventory.domain.Putter;
 
  
  
public class PutterServiceImplementation implements PutterService {  
  
 @Autowired  
 PutterDao putterdao;  
  
 @Override  
 public void insertData(Putter putter) {  
  putterdao.insertData(putter);  
 }  
  
 @Override  
 public List<Putter> getPutterList() {  
  return putterdao.getPutterList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  putterdao.deleteData(id);  
    
 }  
  
 @Override  
 public Putter getPutter(String id) {  
  return putterdao.getPutter(id);  
 }  
  
 @Override  
 public void updateData(Putter putter) {  
  putterdao.updateData(putter);  
    
 }  
}
