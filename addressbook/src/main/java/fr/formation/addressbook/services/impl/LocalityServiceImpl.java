package fr.formation.addressbook.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.repositories.LocalityRepository;
import fr.formation.addressbook.services.LocalityService;

/**
 * @author Administrateur
 */
@Service
public class LocalityServiceImpl implements LocalityService {

    @Autowired
    private LocalityRepository repository;

    /**
     * @return all addresses
     */
    @Override
    public List<Locality> findAll() {
	List<Locality> addresses = repository.findAll();
	return addresses;
    }
}

