package br.com.drop.repository;

import br.com.drop.model.entities.Images;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ImageRepository extends JpaRepository<Images, Integer> {
}
