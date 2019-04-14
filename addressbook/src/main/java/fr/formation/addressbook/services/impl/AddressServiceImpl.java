package fr.formation.addressbook.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.repositories.AddressJpaRepository;
import fr.formation.addressbook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private static final Logger LOGGER = LogManager
	    .getLogger(AddressServiceImpl.class);

    @Autowired
    private AddressJpaRepository repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void create(@Valid AddressDto dto) {
	Address address = mapper.map(dto, Address.class);
	repo.save(address);
    }

    @Override
    public List<AddressDto> findAll() {
	List<Address> addresses = repo.findAll();
	List<AddressDto> addressDtos = new ArrayList<>();
	for (Address address : addresses) {
	    AddressDto addressDto = mapper.map(address, AddressDto.class);
	    addressDtos.add(addressDto);
	}
	return Collections.unmodifiableList(addressDtos);
    }
}
