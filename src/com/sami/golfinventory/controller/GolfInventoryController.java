package com.sami.golfinventory.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sami.golfinventory.domain.Ball;
import com.sami.golfinventory.domain.Driver;
import com.sami.golfinventory.domain.Glove;
import com.sami.golfinventory.domain.Iron;
import com.sami.golfinventory.domain.Putter;
import com.sami.golfinventory.domain.Wedge;
import com.sami.golfinventory.domain.Wood;
import com.sami.golfinventory.services.BallService;
import com.sami.golfinventory.services.DriverService;
import com.sami.golfinventory.services.GloveService;
import com.sami.golfinventory.services.IronService;
import com.sami.golfinventory.services.PutterService;
import com.sami.golfinventory.services.WedgeService;
import com.sami.golfinventory.services.WoodService;

  
@Controller
@SessionAttributes("itemId")
public class GolfInventoryController  {  
  
	@Autowired  
	DriverService driverService;  
	@Autowired
	WoodService woodService;
	@Autowired
	IronService ironService;
	@Autowired
	WedgeService wedgeService;
	@Autowired
	PutterService putterService;
	@Autowired
	GloveService gloveService;
	@Autowired
	BallService ballService;

	/* All Common stuff will be entered here */
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage", "Sami's Golf Stuff Inventory");
	}


	@InitBinder
	public void initBinder(WebDataBinder binder){
	//If you want to ignore or have special behaviour for some fields, define them here
	//  for example binder.setDisallowedFields(new String[] {"manufacturer"});
	}

	@RequestMapping("/addNewDriver")  
	public ModelAndView addNewDriver(ModelAndView model){
		Driver newDriver = new Driver();
		model.addObject("item", newDriver);
		model.setViewName("addNewDriver");
	
		return model;
	} 

	@RequestMapping("/addDriver")  
	public String insertData(@Valid @ModelAttribute("driver1") Driver driver, BindingResult result) {  
		if(result.hasErrors()){
			return "addNewDriver";
		}
		if (driver != null)  
			driverService.insertData(driver);  
		return "redirect:/getList";  
	}  

	@RequestMapping("/addNewWood")  
	public ModelAndView addNewWood(ModelAndView model){
		Wood newWood = new Wood();
		model.addObject("item", newWood);
		model.setViewName("addNewWood");
	
		return model;
	} 
 
 	@RequestMapping("/addWood")  
 	public String insertData(@Valid @ModelAttribute("wood1") Wood wood, BindingResult result) {  
	 	if(result.hasErrors()){
			return "addNewWood";
		}
	 	if (wood != null)  
		 	woodService.insertData(wood);  
	 	return "redirect:/getList";  
 	}  
 
 	@RequestMapping("/addNewIron")  
 	public ModelAndView addNewIron(ModelAndView model){
	 	Iron newIron = new Iron();
	 	model.addObject("item", newIron);
	 	model.setViewName("addNewIron");
 	
 		return model;
 	} 
  
  	@RequestMapping("/addIron")  
  	public String insertData(@Valid @ModelAttribute("iron1") Iron iron, BindingResult result) {  
	  	if(result.hasErrors()){
			return "addNewIron";
		}
	  	if (iron != null)  
		  ironService.insertData(iron);  
	  	return "redirect:/getList";  
  	}  
  
  	@RequestMapping("/addNewWedge")  
  	public ModelAndView addNewWedge(ModelAndView model){
	  	Wedge newWedge = new Wedge();
	  	model.addObject("item", newWedge);
	  	model.setViewName("addNewWedge");
  	
  		return model;
  	} 
   
  	@RequestMapping("/addWedge")  
	public String insertData(@Valid @ModelAttribute("wedge1") Wedge wedge, BindingResult result) {  
  		if(result.hasErrors()){
  			return "addNewWedge";
 		}
  		if (wedge != null)  
  			wedgeService.insertData(wedge);  
  		return "redirect:/getList";  
   	}  
 
   	@RequestMapping("/addNewPutter")  
   	public ModelAndView addNewPutter(ModelAndView model){
	   	Putter newPutter = new Putter();
	   	model.addObject("item", newPutter);
	   	model.setViewName("addNewPutter");
   	
   		return model;
   	} 
    
    @RequestMapping("/addPutter")  
    public String insertData(@Valid @ModelAttribute("putter1") Putter putter, BindingResult result) {  
	  	if(result.hasErrors()){
	  		return "addNewPutter";
	  	}
	  	if (putter != null)  
	  		putterService.insertData(putter);  
	    return "redirect:/getList";  
    }  
    
    @RequestMapping("/addNewBall")  
    public ModelAndView addNewBall(ModelAndView model){
    	Ball newBall = new Ball();
    	model.addObject("item", newBall);
    	model.setViewName("addNewBall");
    	
    	return model;
    } 
     
    @RequestMapping("/addBall")  
    public String insertData(@Valid @ModelAttribute("ball1") Ball ball, BindingResult result) {  
	   	if(result.hasErrors()){
	   		return "addNewBall";
	   	}
	   	if (ball != null)  
	   		ballService.insertData(ball);  
	   	return "redirect:/getList";  
    } 
     
    @RequestMapping("/addNewGlove")  
    public ModelAndView addNewGlove(ModelAndView model){
     	Glove newGlove = new Glove();
     	model.addObject("item", newGlove);
     	model.setViewName("addNewGlove");
     	
     	return model;
    } 
      
    @RequestMapping("/addGlove")  
    public String insertData(@Valid @ModelAttribute("glove1") Glove glove, BindingResult result) {  
    	if(result.hasErrors()){
    		return "addNewGlove";
    	}
    	if (glove != null)  
    		gloveService.insertData(glove);  
	    return "redirect:/getList";  
    }  
     
	@RequestMapping("/editDriver")  
	public ModelAndView editDriver(@RequestParam String id, @ModelAttribute Driver driver, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		driver = driverService.getDriver(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("driver", driver);
		
		return new ModelAndView("editDriver", "map", map);  
	  
	}  
	  
	@RequestMapping("/updateDriver")  
	public String updateDriver(@ModelAttribute Driver driver, BindingResult result) {  
		driverService.updateData(driver);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deleteDriver")  
	public String deleteDriver(@RequestParam String id) {  
		System.out.println("id = " + id);  
		driverService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/editWood")  
	public ModelAndView editWood(@RequestParam String id, @ModelAttribute Wood wood, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		wood = woodService.getWood(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("wood", wood);
		
		return new ModelAndView("editWood", "map", map);  
	  
	}  
	  
	@RequestMapping("/updateWood")  
	public String updateWood(@ModelAttribute Wood wood, BindingResult result) {  
		woodService.updateData(wood);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deleteWood")  
	public String deleteWood(@RequestParam String id) {  
		System.out.println("id = " + id);  
		woodService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/editIron")  
	public ModelAndView editIron(@RequestParam String id, @ModelAttribute Iron iron, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		iron = ironService.getIron(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("iron", iron);
		
		return new ModelAndView("editIron", "map", map);  
	  
	}  
	  
	@RequestMapping("/updateIron")  
	public String updateIron(@ModelAttribute Iron iron, BindingResult result) {  
		ironService.updateData(iron);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deleteIron")  
	public String deleteIron(@RequestParam String id) {  
		System.out.println("id = " + id);  
		ironService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/editWedge")  
	public ModelAndView editWedge(@RequestParam String id, @ModelAttribute Wedge wedge, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		wedge = wedgeService.getWedge(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("wedge", wedge);
		
		return new ModelAndView("editWedge", "map", map);  
	  
	}  
	  
	@RequestMapping("/updateWedge")  
	public String updateWedge(@ModelAttribute Wedge wedge, BindingResult result) {  
		wedgeService.updateData(wedge);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deleteWedge")  
	public String deleteWedge(@RequestParam String id) {  
		System.out.println("id = " + id);  
		wedgeService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/editPutter")  
	public ModelAndView editPutter(@RequestParam String id, @ModelAttribute Putter putter, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		putter = putterService.getPutter(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("putter", putter);
		
		return new ModelAndView("editPutter", "map", map);  
	  
	}  
	  
	@RequestMapping("/updatePutter")  
	public String updatePutter(@ModelAttribute Putter putter, BindingResult result) {  
		putterService.updateData(putter);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deletePutter")  
	public String deletePutter(@RequestParam String id) {  
		System.out.println("id = " + id);  
		putterService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/editBall")  
	public ModelAndView editBall(@RequestParam String id, @ModelAttribute Ball ball, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		ball = ballService.getBall(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("ball", ball);
		
		return new ModelAndView("editBall", "map", map);  
	  
	}  
	  
	@RequestMapping("/updateBall")  
	public String updateBall(@ModelAttribute Ball ball, BindingResult result) {  
		ballService.updateData(ball);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deleteBall")  
	public String deleteBall(@RequestParam String id) {  
		System.out.println("id = " + id);  
		ballService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/editGlove")  
	public ModelAndView editGlove(@RequestParam String id, @ModelAttribute Glove glove, HttpSession session ) {  
	  
		session.setAttribute("itemId", id);
		glove = gloveService.getGlove(id);  
		Map<String, Object> map = new HashMap<String, Object>();  
		map.put("glove", glove);
		
		return new ModelAndView("editGlove", "map", map);  
	  
	}  
	  
	@RequestMapping("/updateGlove")  
	public String updateGlove(@ModelAttribute Glove glove, BindingResult result) {  
		gloveService.updateData(glove);  
		return "redirect:/getList";  
		
	}  
	  
	@RequestMapping("/deleteGlove")  
	public String deleteGlove(@RequestParam String id) {  
		System.out.println("id = " + id);  
		gloveService.deleteData(id);  
		return "redirect:/getList";  
	}  
	
	@RequestMapping("/getList")  
	public ModelAndView getInventoryList() {  
		Map<String, List> model = new HashMap<String, List>();
		List<Driver> driverList = driverService.getDriverList();  
		List<Wood> woodList = woodService.getWoodList();
		List<Iron> ironList = ironService.getIronList();
		List<Wedge> wedgeList = wedgeService.getWedgeList();
		List<Putter> putterList = putterService.getPutterList();
		List<Glove> gloveList = gloveService.getGloveList();
		List<Ball> ballList = ballService.getBallList();
		model.put("driverList", driverList);
		model.put("woodList", woodList);
		model.put("ironList", ironList);
		model.put("wedgeList", wedgeList);
		model.put("putterList", putterList);
		model.put("gloveList", gloveList);
		model.put("ballList", ballList);
		
		return new ModelAndView("inventoryList", "model", model);  
	} 
}	
