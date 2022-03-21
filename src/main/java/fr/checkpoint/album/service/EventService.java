package fr.checkpoint.album.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import fr.checkpoint.album.dto.CreateEventDto;
import fr.checkpoint.album.entity.Continent;
import fr.checkpoint.album.entity.Event;
import fr.checkpoint.album.entity.Picture;
import fr.checkpoint.album.repository.ContinentRepository;
import fr.checkpoint.album.repository.EventRepository;
import fr.checkpoint.album.repository.PictureRepository;

@Service
public class EventService {

	@Autowired
	EventRepository eventRepository;
	
	@Autowired
	ContinentRepository continentRepository;
	
	@Autowired
	PictureRepository pictureRepository;
	
	public Event getEventById(@PathVariable Long id) {
		return eventRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public List<Event> getEvents() {
		return eventRepository.findAll(Sort.by(Sort.Direction.ASC, "creationDate"));
	}
	
	public ResponseEntity<String> createEvent(@Valid CreateEventDto createEventDto) {
		Event event = new Event();
		
		Continent continent = continentRepository.findById(createEventDto.getContinentId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		event.setContinentId(continent);
		
		event.setCreationDate(new Date());
		event.setDate(createEventDto.getDate());
		event.setDescription(createEventDto.getDescription());
		event.setPlace(createEventDto.getPlace());
		event.setTitle(createEventDto.getTitle());
		eventRepository.save(event);
		
		List<Picture> pictures = new ArrayList<>();
		
		
		String[] urlArray = createEventDto.getPictures().split(",");
		for (String url : urlArray) {
			Picture picture = new Picture();
			picture.setUrl(url);
			picture.setEvent(event);
			pictureRepository.save(picture);
			pictures.add(picture);
		}
		
		
		event.setPictures(pictures);
		eventRepository.save(event); 
		
		return new ResponseEntity<>("Event created successfully", HttpStatus.OK);
	}
	
	public ResponseEntity<String> modifyEventById(@PathVariable Long id, @Valid CreateEventDto createEventDto) {
		Event event =  getEventById(id);
		
		event.setTitle(createEventDto.getTitle());
		event.setDescription(createEventDto.getDescription());
		event.setPlace(createEventDto.getPlace());
		
		Continent continent = continentRepository.findById(createEventDto.getContinentId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		event.setContinentId(continent);
		event.setDate(createEventDto.getDate());
		
		List<Picture> picturesToDelete = event.getPictures();
		event.setPictures(null);
		for (Picture picture : picturesToDelete) {
			pictureRepository.deleteById(picture.getId());
		}
		
		List<Picture> pictures = new ArrayList<>();
		
		
		String[] urlArray = createEventDto.getPictures().split(",");
		for (String url : urlArray) {
			Picture picture = new Picture();
			picture.setUrl(url);
			picture.setEvent(event);
			pictureRepository.save(picture);
			pictures.add(picture);
		}
		
		
		event.setPictures(pictures);
		eventRepository.save(event); 
		return new ResponseEntity<>("Event modified successfully", HttpStatus.OK);
		
	}
	
	public void deleteEventById(@PathVariable Long id) {
		eventRepository.deleteById(id);
	}
	
}
