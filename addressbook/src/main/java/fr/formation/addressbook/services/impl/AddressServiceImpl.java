package fr.formation.addressbook.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.Utils.CsvProperties;
import fr.formation.addressbook.Utils.CsvReader;
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

    @Autowired
    private CsvProperties properties;

    @Override
    public ResponseEntity<Boolean> saveAll() {
	repository.deleteAll();
	List<Address> addresses = repository
		.saveAll(CsvReader.readCsvFile(properties.getCsvUrl()));
	return !addresses.isEmpty()
		? new ResponseEntity<>(true, HttpStatus.CREATED)
		: new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }
}
