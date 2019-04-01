package fr.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.addressbook.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{}
