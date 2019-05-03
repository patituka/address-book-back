package fr.formation.addressbook.services.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.repositories.LocalityRepository;
import fr.formation.addressbook.services.LocalityService;
import fr.formation.addressbook.utils.CsvProperties;
import fr.formation.addressbook.utils.CsvReader;
import fr.formation.addressbook.utils.ObjectMapperUtils;

/**
 * @author Administrateur
 */
@Service
public class LocalityServiceImpl implements LocalityService {

    private static final Logger LOGGER = LoggerFactory
	    .getLogger(LocalityServiceImpl.class);

    @Autowired
    private LocalityRepository repository;

    @Autowired
    private CsvProperties properties;

    @Autowired
    private ModelMapper mapper;

    /**
     * @return
     */
    @Override
    public Optional<List<Locality>> saveAll() {
	repository.deleteAll();
	List<Locality> list = repository
		.saveAll(CsvReader.readCsvFile(properties.getCsvUrl()));
	return Optional.of(list);
    }

    /**
     * @param zipCode
     * @return city by zipCode
     */
    @Override
    public Optional<List<LocalityDto>> getCityList(String zipCode) {
	List<Locality> list = repository.findAllByZipCode(zipCode);
	List<LocalityDto> dtos = ObjectMapperUtils.mapAll(list,
		LocalityDto.class);
	return Optional.of(Collections.unmodifiableList(dtos));
    }

    /**
     * @param page
     * @param size
     * @return list of localities
     */
    @Override
    public Optional<List<LocalityDto>> getAll(int page, int size) {
	PageRequest pageReq = PageRequest.of(page, size);
	List<Locality> list = repository.findAll(pageReq).getContent();
	List<LocalityDto> dtos = ObjectMapperUtils.mapAll(list,
		LocalityDto.class);
	return Optional.of(Collections.unmodifiableList(dtos));
    }
}
