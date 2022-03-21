package fr.checkpoint.album.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.checkpoint.album.entity.Picture;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long>{

}
