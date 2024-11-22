package com.maven.SpringApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flipkart")
public class Controller {
	
	@RequestMapping(value ="/Laptop",method = RequestMethod.GET)
	public String FirstApi()
	{
		return "Asus,Dell,Mac-Book,HP,Lenovo";
	}
	
	@PostMapping("/Add To Cart")
	public String SecondApi()
	{
		return "Your Selected Items Are Added...... ";
		
	}

	@PutMapping("/OrderComfirm")
	public String ThirdApi() {
		
		return"Order Comfirm......."; 
	}
	
	@DeleteMapping("/Delete Items")
	public String ForthApi() {
		
		return "Your Selected Items Are Deleted...";
	}
}
