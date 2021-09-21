package com.nt.cntrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.CoinService;




@RestController
public class HomeController {

	@Autowired
	private CoinService service;
	
	@GetMapping(value="/bill_amount/{change}", produces = "application/xml")
	@ResponseBody
	public String givechange(@PathVariable double change){
		
		return service.getchange(change);
	}
	
}

