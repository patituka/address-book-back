package fr.formation.addressbook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.repositories.LocalityRepository;
import fr.formation.addressbook.services.AddressService;
import fr.formation.addressbook.services.LocalityService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	private static final Logger logger = LogManager.getLogger(AddressController.class);
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
    public List<LocalityDto> getCity(@PathVariable String zipCode
){ 
    	return serviceLoc.getCityList(zipCode);
    }
    
    @GetMapping("/cities")
    public Page<Locality> getAllCities(@PageableDefault(size = 5, sort = "id") Pageable pageable) {
		return serviceLoc.getCities(pageable);
    }
    
    @DeleteMapping("/{id}")
    protected void delete(@PathVariable Long id) {
    service.delete(id);
    }
    
    @GetMapping("/list")
    protected List<AddressDto> getAllAddress(){
    return service.getAddresses();
    }

}
