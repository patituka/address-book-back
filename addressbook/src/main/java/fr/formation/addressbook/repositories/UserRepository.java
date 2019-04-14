package fr.formation.addressbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.addressbook.entities.User;

/**
 * @author Administrateur
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * @param username
     * @return user
     */
    User findByUsername(String username);
}
