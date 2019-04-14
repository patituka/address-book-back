package fr.formation.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.addressbook.entities.Address;

/**
 * @author Administrateur
 */
public interface AddressJpaRepository extends JpaRepository<Address, Long> {
}
