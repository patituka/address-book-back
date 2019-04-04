package fr.formation.addressbook.services;

import java.util.List;
import org.springframework.http.ResponseEntity;
import fr.formation.addressbook.entities.Locality;

/**
 * @author Administrateur
 */
public interface LocalityService {

    ResponseEntity<Boolean> saveAll();

	List<Locality> getCityList(String zipCode);
}
