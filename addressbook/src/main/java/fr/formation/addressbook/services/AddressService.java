package fr.formation.addressbook.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.addressbook.dtos.AddressDto;

public interface AddressService {

    /**
     * @param dto
     */
    public void create(@Valid AddressDto dto);

    /**
     * @return addresses
     */
    List<AddressDto> findAll();
}
