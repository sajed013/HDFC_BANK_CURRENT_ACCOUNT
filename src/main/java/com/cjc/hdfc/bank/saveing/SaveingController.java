package com.cjc.hdfc.bank.saveing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveingController {

	
	@GetMapping("/getSaveing")
	public String SaveingGet() {

		return "Saveing account open";
	}
}
