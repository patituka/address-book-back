package fr.formation.addressbook.services;

import org.springframework.http.ResponseEntity;

/**
 * @author Administrateur
 */
public interface LocalityService {

    ResponseEntity<Boolean> saveAll();
}
