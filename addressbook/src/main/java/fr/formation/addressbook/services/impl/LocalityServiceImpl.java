package fr.formation.addressbook.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	private ModelMapper mapper;

    @Autowired
    private LocalityRepository repository;

    @Autowired
    private CsvProperties properties;

    @Transactional
    @Override
    public ResponseEntity<Boolean> saveAll() {
	repository.deleteAll();
	List<Locality> addresses = CsvReader.readCsvFile(properties.getCsvUrl());
	repository
		.saveAll(addresses);
	return !addresses.isEmpty()
		? new ResponseEntity<>(true, HttpStatus.CREATED)
		: new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

    @Override
    public List<LocalityDto> getCityList(String zipCode) {	
	
    List<Locality> list = repository.findAllByZipCode(zipCode);
	List<LocalityDto> dtos = new ArrayList<>();
	for (Locality locality: list) {
		LocalityDto dto = mapper.map(locality, LocalityDto.class);
		dtos.add(dto);
	}
	System.out.println(dtos);
	return dtos;
	
    }

	@Override
	public Page<Locality> getCities(Pageable pageable) {
		Page<Locality> page = repository.findAll(pageable);
		return page;
	}
	
}
