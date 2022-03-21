package fr.checkpoint.album.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.checkpoint.album.entity.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long>{

}
