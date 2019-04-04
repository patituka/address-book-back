package fr.formation.addressbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.services.LocalityService;

@SuppressWarnings("javadoc")
@RestController
@RequestMapping("/address")
public class LocalityController {

    @Autowired
    public LocalityService service;

    @GetMapping("/save")
    public ResponseEntity<Boolean> saveCsvData() {
	return service.saveAll();
    }
    
    @GetMapping("/city/{zipCode}")
    public List<Locality> getCity(@PathVariable String zipCode){
    	return service.getCityList(zipCode);
    }
}