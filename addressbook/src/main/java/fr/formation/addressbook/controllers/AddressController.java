package fr.formation.addressbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.services.AddressService;

@SuppressWarnings("javadoc")
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    public AddressService service;

    @GetMapping("/all")
    public List<Address> getAll() {
	return service.findAll();
    }
}
