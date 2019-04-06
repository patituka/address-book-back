package fr.formation.addressbook.services;

import java.util.List;
import java.util.Optional;

import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.entities.Locality;

/**
 * @author Administrateur
 */
public interface LocalityService {

    Optional<List<Locality>> saveAll();

    Optional<List<LocalityDto>> getCityList(String zipCode);
}
