package fr.formation.addressbook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.services.AddressService;
import fr.formation.addressbook.services.LocalityService;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
	this.service = service;
    }
    
    @Autowired
    public LocalityService serviceLoc;

    @PostMapping
    protected void create(@Valid @RequestBody AddressDto address) {
	service.create(address);
    }
    
    @GetMapping("/save")
    public ResponseEntity<Boolean> saveCsvData() {
	return serviceLoc.saveAll();
    }
    
    @GetMapping("/city/{zipCode}")
    public List<Locality> getCity(@PathVariable String zipCode){
    	return serviceLoc.getCityList(zipCode);
    }
}
