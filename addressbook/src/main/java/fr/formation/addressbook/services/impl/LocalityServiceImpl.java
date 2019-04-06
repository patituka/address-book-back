package fr.formation.addressbook.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<List<Locality>> saveAll() {
	repository.deleteAll();
	List<Locality> list = repository
		.saveAll(CsvReader.readCsvFile(properties.getCsvUrl()));
	return Optional.of(list);
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
