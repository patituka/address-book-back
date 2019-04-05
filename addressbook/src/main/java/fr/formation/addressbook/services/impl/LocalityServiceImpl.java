package fr.formation.addressbook.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.dtos.LocalityDto;
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

    @Autowired
    private ModelMapper mapper;

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
    public List<LocalityDto> getCityList(String zipCode) {
	List<Locality> list = repository.findAllByZipCode(zipCode);
	List<LocalityDto> dtos = new ArrayList<>();
	for (Locality locality : list) {
	    LocalityDto dto = mapper.map(locality, LocalityDto.class);
	    dtos.add(dto);
	}
	return Collections.unmodifiableList(dtos);
    }
}
