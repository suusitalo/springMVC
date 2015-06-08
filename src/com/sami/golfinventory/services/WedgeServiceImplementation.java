package com.sami.golfinventory.services;

import java.util.List;  
  




import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.WedgeDao;
import com.sami.golfinventory.domain.Wedge;
 
  
  
public class WedgeServiceImplementation implements WedgeService {  
  
 @Autowired  
 WedgeDao wedgedao;  
  
 @Override  
 public void insertData(Wedge wedge) {  
  wedgedao.insertData(wedge);  
 }  
  
 @Override  
 public List<Wedge> getWedgeList() {  
  return wedgedao.getWedgeList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  wedgedao.deleteData(id);  
    
 }  
  
 @Override  
 public Wedge getWedge(String id) {  
  return wedgedao.getWedge(id);  
 }  
  
 @Override  
 public void updateData(Wedge wedge) {  
  wedgedao.updateData(wedge);  
    
 }  
}
