package fr.formation.addressbook.controllers;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.models.CsvResponse;
import fr.formation.addressbook.repositories.LocalityRepository;
import fr.formation.addressbook.services.LocalityService;
import fr.formation.addressbook.utils.PaginationUtils;

/**
 * @author Administrateur
 */
@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    public LocalityService service;

    @Autowired
    private LocalityRepository repository;

    /**
     * @return true if created
     */
    @GetMapping("/save")
    public ResponseEntity<CsvResponse> saveCsvData() {
	Optional<CsvResponse> response = service.saveAll();
	return response.isPresent()
		? new ResponseEntity<>(response.get(), HttpStatus.CREATED)
		: new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

    /**
     * @param page
     * @param size
     * @param sortDir
     * @param sort
     * @return page
     */
    @GetMapping("/all/{page}")
    public ResponseEntity<List<LocalityDto>> getAllLocalities(
	    @PathVariable int page) {
	Optional<List<LocalityDto>> listOptional = service.getAll(page, 20);
	return listOptional.isPresent()
		? new ResponseEntity<>(listOptional.get(), HttpStatus.OK)
		: new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
    }

    /**
     * @param pageable
     * @return
     * @throws URISyntaxException
     */
    @GetMapping("/locality")
    public ResponseEntity<List<Locality>> getAllRepos(Pageable pageable)
	    throws URISyntaxException {
	Slice<Locality> slice = repository.findSliceBy(pageable);
	HttpHeaders headers = PaginationUtils.generateSliceHttpHeaders(slice);
	return new ResponseEntity<>(slice.getContent(), headers, HttpStatus.OK);
    }
}
