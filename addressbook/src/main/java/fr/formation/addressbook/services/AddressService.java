package fr.formation.addressbook.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.addressbook.dtos.AddressDto;
import fr.formation.addressbook.entities.Address;

public interface AddressService {

    /**
     * @param dto
     */
    public void create(@Valid AddressDto dto);

	public void delete(Long id);

	public List<AddressDto> getAddresses();
	
}
