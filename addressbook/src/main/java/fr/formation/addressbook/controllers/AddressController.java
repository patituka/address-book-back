package fr.formation.addressbook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @PostMapping
    protected @ResponseBody ResponseEntity<String> create(
	    @Valid @RequestBody AddressDto address) {
	service.create(address);
	return new ResponseEntity<>("POST Response", HttpStatus.OK);
    }

    /**
     * @return
     */
    @GetMapping("/save")
    public ResponseEntity<Boolean> saveCsvData() {
	return serviceLoc.saveAll();
    }

    /**
     * @param zipCode
     * @return
     */
    @GetMapping("/city/{zipCode}")
    public List<LocalityDto> getCity(@PathVariable String zipCode) {
	return serviceLoc.getCityList(zipCode);
    }
}
