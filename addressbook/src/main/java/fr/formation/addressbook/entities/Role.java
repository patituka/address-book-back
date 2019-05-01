package fr.formation.addressbook.entities;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Administrateur
 */
public enum Role implements GrantedAuthority {
    ROLE_ADMIN, ROLE_USER, ROLE_CLIENT;

    @Override
    public String getAuthority() {
	return name();
    }
}
