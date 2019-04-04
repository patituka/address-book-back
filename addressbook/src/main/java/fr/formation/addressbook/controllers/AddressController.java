package fr.formation.addressbook.controllers;

import javax.validation.Valid;
import javax.xml.ws.Service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.dtos.AddressPartCreateDto;
import fr.formation.addressbook.services.AddressPartService;

@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	private final AddressPartService service;
	
	public AddressController (AddressPartService service) {
		this.service = service;
	}
	

	@PostMapping ("/particular")
	protected void create (@Valid @RequestBody AddressPartCreateDto addressPart) {
		service.create(addressPart);
	}
	
	
	
	
}
