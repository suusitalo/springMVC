package com.sami.golfinventory.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  

import com.sami.golfinventory.dao.WoodDao;
import com.sami.golfinventory.domain.Wood;

public class WoodServiceImplementation implements WoodService{

	@Autowired  
	WoodDao wooddao;  
	  
	@Override  
	public void insertData(Wood wood) {  
		wooddao.insertData(wood);  
	}  
	  
	@Override  
	public List<Wood> getWoodList() {  
		 return wooddao.getWoodList();  
	}  
	  
	@Override  
	public void deleteData(String id) {  
		 wooddao.deleteData(id);  
	}  
	  
	@Override  
	public Wood getWood(String id) {  
		 return wooddao.getWood(id);  
	}  
	  
	@Override  
	public void updateData(Wood wood) {  
		wooddao.updateData(wood);  
	}  
	
}
