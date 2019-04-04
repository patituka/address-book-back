package fr.formation.addressbook.services.impl;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.repositories.AddressJpaRepository;
import fr.formation.addressbook.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	
	private final AddressJpaRepository repo;
	
	public AddressServiceImpl (AddressJpaRepository repo ) {
		this.repo = repo;
	}

	@Override
	public void create(@Valid AddressDto dto) {
			Address address = new Address();
			address.setTypes(dto.getTypes());
			address.setIdentity(dto.getIdentity());
			address.setIdentification(dto.getIdentification());
			address.setLocalisationComplement(dto.getLocalisationComplement());
			address.setLabel(dto.getLabel());
			address.setDistributionServices(dto.getDistributionServices());
			address.setLocality(dto.getLocality());
			repo.save(address);
	}

}
