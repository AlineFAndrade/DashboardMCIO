package br.com.taking.DashboarMCIO.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.taking.DashboarMCIO.pitchwink.service.PitchWinkClientService;

@RestController
public class TestController {
	
	@Autowired
	private PitchWinkClientService pitchwinkService;
	
	

}
