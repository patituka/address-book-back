package fr.formation.addressbook.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import fr.formation.addressbook.dtos.LocalityDto;

/**
 * @author Administrateur
 */
public interface LocalityService {

    ResponseEntity<Boolean> saveAll();

    List<LocalityDto> getCityList(String zipCode);
}
