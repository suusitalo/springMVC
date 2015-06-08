package com.sami.golfinventory.services;


import java.util.List;  

import com.sami.golfinventory.domain.Wood;

public interface WoodService {

	public void insertData(Wood wood);  
	public List<Wood> getWoodList();  
	public void deleteData(String id);  
	public Wood getWood(String id);  
	public void updateData(Wood wood);  
	
}
