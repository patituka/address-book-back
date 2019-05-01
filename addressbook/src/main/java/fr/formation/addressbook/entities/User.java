package fr.formation.addressbook.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Administrateur
 */
@Entity
public class User extends AbstractEntity implements UserDetails {

    private static final long serialVersionUID = -7775089429147888349L;

    @Column(length = 38, nullable = false)
    private String status;

    @Column(length = 38, nullable = false)
    private String username;

    @Column(length = 40, nullable = false)
    @Size(min = 8)
    private String password;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 40, nullable = false)
    private String firstname;

    @Column(length = 40, nullable = false)
    private String lastname;

    @ManyToMany
    List<Address> addresses;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles;

    /**
     * @param status
     */
    public User(String status) {
	this.status = status;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	return null;
    }

    @Override
    public String getPassword() {
	return null;
    }

    @Override
    public String getUsername() {
	return null;
    }

    @Override
    public boolean isAccountNonExpired() {
	return false;
    }

    @Override
    public boolean isAccountNonLocked() {
	return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
	return false;
    }

    @Override
    public boolean isEnabled() {
	return false;
    }
}
