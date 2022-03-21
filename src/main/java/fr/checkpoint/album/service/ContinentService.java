package fr.checkpoint.album.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import fr.checkpoint.album.entity.Continent;
import fr.checkpoint.album.repository.ContinentRepository;

@Service
public class ContinentService {

	@Autowired
	ContinentRepository continentRepository;
	
	public List<Continent> getContinents() {
		return continentRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
	}
}
