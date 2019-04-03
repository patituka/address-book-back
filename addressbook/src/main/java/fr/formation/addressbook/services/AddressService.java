package fr.formation.addressbook.services;

import java.util.List;

import fr.formation.addressbook.entities.Address;

public interface AddressService {
	
	List<Address> findAll();

}
