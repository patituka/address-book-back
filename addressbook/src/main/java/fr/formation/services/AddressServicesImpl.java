package fr.formation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.entities.Address;
import fr.formation.repositories.AddressRepository;

@Service
public class AddressServicesImpl implements AddressService{
	
	@Autowired
	AddressRepository repository;

	@Override
	public List<Address> findAll() {
		List<Address> adresses = repository.findAll();
		return adresses;
	}

}
