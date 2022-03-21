package fr.checkpoint.album.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.action.internal.EntityActionVetoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.checkpoint.album.dto.CreateEventDto;
import fr.checkpoint.album.entity.Event;
import fr.checkpoint.album.service.EventService;

@RestController
@CrossOrigin
@RequestMapping("/events")
public class EventController {

	@Autowired
	EventService eventService;
	
	@PostMapping
	public ResponseEntity<String> createEvent(@Valid CreateEventDto createEventDto) {
		return eventService.createEvent(createEventDto);
	}
	
	@GetMapping("/{id}")
	public Event getEventById(@PathVariable Long id) {
		return eventService.getEventById(id);
	}
	
	@GetMapping
	public List<Event> getEvents() {
		return eventService.getEvents();
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<String> modifyEventById(@PathVariable Long id, @Valid CreateEventDto createEventDto) {
		return eventService.modifyEventById(id, createEventDto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEventById(@PathVariable Long id) {
		eventService.deleteEventById(id);
	}
}
