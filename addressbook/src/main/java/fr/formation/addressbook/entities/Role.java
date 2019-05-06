package fr.formation.addressbook.entities;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Patricia
 */
public enum Role implements GrantedAuthority {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String authority;

    Role(String authority) {
	this.authority = authority;
    }

    /**
     * @return
     */
    @Override
    public String getAuthority() {
	return authority;
    }
}
