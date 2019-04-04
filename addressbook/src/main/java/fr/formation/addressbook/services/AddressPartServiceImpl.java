package fr.formation.addressbook.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import fr.formation.addressbook.dtos.AddressPartCreateDto;
import fr.formation.addressbook.entities.Address;
import fr.formation.addressbook.repositories.AddressJpaRepository;


@Service
public class AddressPartServiceImpl implements AddressPartService {
	
	
	private final AddressJpaRepository repo;
	
	public AddressPartServiceImpl (AddressJpaRepository repo) {
		this.repo = repo;
			}

	@Override
	public void create(@Valid AddressPartCreateDto dto) {
			Address address = new Address();
			address.setTypes(dto.getTypes());
			address.setIdentity(dto.getIdentity());
			address.setIdentification(dto.getIdentification());
			address.setLocalisationComplement(dto.getLocalisationComplement());
			address.setLabel(dto.getLabel());
			address.setDistributionServices(dto.getDistributionServices());
			address.setZipCode(dto.getZipCode());
			address.setLocality(dto.getLocality());
			repo.save(address);
			

	}

}
