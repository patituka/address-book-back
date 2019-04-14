package fr.formation.addressbook.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.services.AddressService;
import fr.formation.addressbook.services.LocalityService;

/**
 * @author Administrateur
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @Autowired
    public LocalityService serviceLoc;

    /**
     * @param addressDto
     * @return response HttpStatus
     */
    @PostMapping
    public ResponseEntity<AddressDto> create(
	    @Valid @RequestBody AddressDto addressDto) {
	service.create(addressDto);
	return new ResponseEntity<>(addressDto, HttpStatus.OK);
    }

    /**
     * @return list
     */
    @GetMapping("/all")
    public List<AddressDto> getAddresses() {
	return service.findAll();
    }

    /**
     * @param zipCode
     * @return response HttpStatus
     */
    @GetMapping("/city/{zipCode}")
    public ResponseEntity<List<LocalityDto>> getCity(
	    @PathVariable String zipCode) {
	Optional<List<LocalityDto>> listOptional = serviceLoc
		.getCityList(zipCode);
	return listOptional.isPresent()
		? new ResponseEntity<>(listOptional.get(), HttpStatus.OK)
		: new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
