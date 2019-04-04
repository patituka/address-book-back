package fr.formation.addressbook.services;

import javax.validation.Valid;

import fr.formation.addressbook.dtos.AddressDto;

public interface AddressService {

    /**
     * @param dto
     */
    public void create(@Valid AddressDto dto);
}
