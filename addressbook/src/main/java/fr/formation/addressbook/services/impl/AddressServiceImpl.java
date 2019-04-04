package fr.formation.addressbook.services.impl;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.repositories.AddressJpaRepository;
import fr.formation.addressbook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressJpaRepository repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void create(@Valid AddressDto dto) {
	Address address = mapper.map(dto, Address.class);
	repo.save(address);
    }
}
