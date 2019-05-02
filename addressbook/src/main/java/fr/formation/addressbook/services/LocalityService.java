package fr.formation.addressbook.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.entities.Locality;

/**
 * @author Administrateur
 */
public interface LocalityService {

    ResponseEntity<Boolean> saveAll();

    List<LocalityDto> getCityList(String zipCode);

	Page<Locality> getCities(Pageable pageable);

	

	
    
    
    
}
