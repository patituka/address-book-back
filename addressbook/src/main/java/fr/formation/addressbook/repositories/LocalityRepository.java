package fr.formation.addressbook.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.addressbook.entities.Locality;

/**
 * @author Administrateur
 */
@Repository
public interface LocalityRepository extends JpaRepository<Locality, Long> {

    /**
     * @param zipCode
     * @return list of Locality( id city zipCode )
     */
    List<Locality> findAllByZipCode(String zipCode);

    /**
     * @param pageable
     * @return
     */
    Slice<Locality> findSliceBy(Pageable pageable);
}
