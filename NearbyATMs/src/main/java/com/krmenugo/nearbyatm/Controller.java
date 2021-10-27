package com.krmenugo.nearbyatm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krmenugo.nearbyatm.domain.NearbyATM;
import com.krmenugo.nearbyatm.service.NearbyATMsService;

@RestController 
public class Controller {

	private static final String MAIN_PAGE = "main";
	private static final String JSON_COUNTRY_URL = "https://www.banamex.com/localizador/jsonP/json5.json";
	
	@Autowired
	private NearbyATMsService service;
	
	@GetMapping
	public String main(final Model model) {
		NearbyATM atms = (NearbyATM) service.parse(JSON_COUNTRY_URL);
		model.addAttribute(JSON_COUNTRY_URL, atms.getServicios());
		//return MAIN_PAGE;
		return JSON_COUNTRY_URL;
	}
	
}
