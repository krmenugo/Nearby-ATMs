package com.krmenugo.nearbyatm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NearbyATMsServiceImplement implements NearbyATMsService {

	@Autowired
	private RestTemplate rest;
	
	@Override
	public Object parse(String url) {
		return rest.getForObject(url, Object.class);
	}

}
