package fr.formation.addressbook.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.repositories.AddressRepository;
import fr.formation.addressbook.services.AddressService;

/**
 * @author Administrateur
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository repository;

    /**
     * @return all addresses
     */
    @Override
    public List<Address> findAll() {
	List<Address> addresses = repository.findAll();
	return addresses;
    }
}
