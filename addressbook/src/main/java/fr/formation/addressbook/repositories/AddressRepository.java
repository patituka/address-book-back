package fr.formation.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.addressbook.entities.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	
	
	
}
