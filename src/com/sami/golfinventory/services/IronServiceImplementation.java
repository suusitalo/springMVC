package com.sami.golfinventory.services;

import java.util.List;  
  




import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.IronDao;
import com.sami.golfinventory.domain.Iron;
 
  
  
public class IronServiceImplementation implements IronService {  
  
 @Autowired  
 IronDao irondao;  
  
 @Override  
 public void insertData(Iron iron) {  
  irondao.insertData(iron);  
 }  
  
 @Override  
 public List<Iron> getIronList() {  
  return irondao.getIronList();  
 }  
  
 @Override  
 public void deleteData(String id) {  
  irondao.deleteData(id);  
    
 }  
  
 @Override  
 public Iron getIron(String id) {  
  return irondao.getIron(id);  
 }  
  
 @Override  
 public void updateData(Iron iron) {  
  irondao.updateData(iron);  
    
 }  
}
