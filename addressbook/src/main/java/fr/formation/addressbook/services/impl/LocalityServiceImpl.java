package fr.formation.addressbook.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.repositories.LocalityRepository;
import fr.formation.addressbook.services.LocalityService;
import fr.formation.addressbook.utils.CsvProperties;
import fr.formation.addressbook.utils.CsvReader;

/**
 * @author Administrateur
 */
@Service
public class LocalityServiceImpl implements LocalityService {

    @Autowired
    private LocalityRepository repository;

    @Autowired
    private CsvProperties properties;

    @Override
    public ResponseEntity<Boolean> saveAll() {
	repository.deleteAll();
	List<Locality> addresses = repository
		.saveAll(CsvReader.readCsvFile(properties.getCsvUrl()));
	return !addresses.isEmpty()
		? new ResponseEntity<>(true, HttpStatus.CREATED)
		: new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

	@Override
	public List<Locality> getCityList(String zipCode) {
		List<Locality> localities = repository.findAllByZipCode(zipCode);
		return localities;
	}
}
