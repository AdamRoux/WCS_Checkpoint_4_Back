package fr.checkpoint.album.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.checkpoint.album.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
