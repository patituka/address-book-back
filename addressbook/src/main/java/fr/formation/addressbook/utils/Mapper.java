package fr.formation.addressbook.utils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.formation.addressbook.dtos.LocalityDto;
import fr.formation.addressbook.entities.Locality;

/**
 * @author Administrateur
 */
public final class Mapper {

    /**
     * @param localityList
     * @return
     */
    public static List<LocalityDto> mapEntityListIntoDto(
	    Collection<Locality> localityList) {
	final List<LocalityDto> localityListDto = localityList.stream()
		.map(Mapper::mapEntityIntoDto).collect(Collectors.toList());
	return localityListDto;
    }

    /**
     * @param locality
     * @return
     */
    public static LocalityDto mapEntityIntoDto(Locality locality) {
	final LocalityDto localityDto = new LocalityDto();
	localityDto.setId(locality.getId().toString());
	return localityDto;
    }

    /**
     * @param pageable
     * @param page
     * @return
     */
    public static Page<LocalityDto> mapEntityPageIntoDtoPage(Pageable pageable,
	    Page<Locality> page) {
	List<LocalityDto> localityListDto = mapEntityListIntoDto(
		page.getContent());
	return null;
	// new PageWrapper<LocalityDto>(localityListDto, pageable,
	// page.getTotalElements());
    }
}
