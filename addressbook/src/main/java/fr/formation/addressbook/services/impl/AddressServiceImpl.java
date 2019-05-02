package fr.formation.addressbook.services.impl;

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
import fr.formation.addressbook.utils.CsvReader;

@Service
public class AddressServiceImpl implements AddressService {
	private static final Logger logger = LogManager.getLogger(AddressServiceImpl.class);
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
	public void delete(Long id) {
	repo.deleteById(id);
	}

	@Override
	public List<Address> getAddresses() {
	List<Address> list = repo.findAll();
	return list;

	}
	
	
}
