package fr.formation.addressbook.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.services.LocalityService;

/**
 * @author Administrateur
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    public LocalityService service;

    /**
     * @return true if created
     */
    @GetMapping("/save")
    public ResponseEntity<Boolean> saveCsvData() {
	Optional<List<Locality>> listOptional = service.saveAll();
	return listOptional.isPresent()
		? new ResponseEntity<>(true, HttpStatus.CREATED)
		: new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
