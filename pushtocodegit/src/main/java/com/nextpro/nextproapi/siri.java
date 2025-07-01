package com.nextpro.nextproapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class siri {

	
	@GetMapping("/ht")	
	public String siri(){
			 return "hello siri you done!";
		}

	
		

	

}
