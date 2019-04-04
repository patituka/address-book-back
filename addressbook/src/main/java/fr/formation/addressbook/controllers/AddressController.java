package fr.formation.addressbook.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
	this.service = service;
    }

    @PostMapping
    protected void create(@Valid @RequestBody AddressDto address) {
	service.create(address);
    }
}
