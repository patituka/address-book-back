package fr.formation.addressbook.services;

import org.springframework.http.ResponseEntity;

/**
 * @author Administrateur
 */
public interface AddressService {

    ResponseEntity<Boolean> saveAll();
}
