package com.app.volleyball.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping("volleyball")
@RestController
public class VolleyballController {
	
	@RequestMapping("/")
	public String informacion(){
		return "Soy el back de volleyball";
	}
	

}
