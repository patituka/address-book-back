package fr.formation.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.addressbook.entities.Locality;


@Repository
public interface LocalityRepository extends JpaRepository<Locality, Long>{
	
	
	
	
}
