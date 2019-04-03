package fr.formation.addressbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.services.AddressService;

@SuppressWarnings("javadoc")
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    public AddressService service;

    @GetMapping("/save")
    public ResponseEntity<Boolean> saveCsvData() {
	return service.saveAll();
    }
}
