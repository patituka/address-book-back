package fr.formation.addressbook.services;

import java.util.List;
import java.util.Optional;

import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.models.CsvResponse;

/**
 * @author Administrateur
 */
public interface LocalityService {

    Optional<CsvResponse> saveAll();

    Optional<List<LocalityDto>> getCityList(String zipCode);

    Optional<List<LocalityDto>> getAll(int page, int size);
}
