package fr.checkpoint.album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.checkpoint.album.entity.Continent;
import fr.checkpoint.album.service.ContinentService;

@RestController
@CrossOrigin
@RequestMapping("/continents")
public class ContinentController {

	@Autowired
	ContinentService continentService;
	
	@GetMapping
	public List<Continent> getContinents() {
		return continentService.getContinents();
	}
	
	
}
