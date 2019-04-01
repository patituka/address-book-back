package fr.formation.services;

import java.util.List;

import fr.formation.addressbook.entities.Address;

public interface AddressService {
	
	List<Address> findAll();

}
