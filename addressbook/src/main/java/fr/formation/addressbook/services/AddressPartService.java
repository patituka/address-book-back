package fr.formation.addressbook.services;

import javax.validation.Valid;

import fr.formation.addressbook.dtos.AddressPartCreateDto;

public interface AddressPartService {
	
	void create (@Valid AddressPartCreateDto addressPart);

}
