package fr.formation.addressbook.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Administrateur
 */
@Entity
public class User extends AbstractEntity implements UserDetails {

    private static final long serialVersionUID = -7775089429147888349L;

    @Column(length = 80, nullable = false)
    private String password;

    @Column(length = 38, nullable = false)
    private String status;

    @Column(unique = true, length = 16, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 40, nullable = false)
    private String firstname;

    @Column(length = 40, nullable = false)
    private String lastname;

    @ManyToMany
    List<Address> addresses;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    /**
     * @param status
     */
    public User(String status) {
	this.status = status;
    }

    public void addRole(Role role) {
	roles.add(role);
    }

    @Override
    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
	return getRoles();
    }

    @Override
    public String getUsername() {
	return username;
    }

    @Override
    public boolean isAccountNonExpired() {
	return true;
    }

    @Override
    public boolean isAccountNonLocked() {
	return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
	return true;
    }

    @Override
    public boolean isEnabled() {
	return true;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public List<Address> getAddresses() {
	return addresses;
    }

    public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
    }

    public Set<Role> getRoles() {
	return roles;
    }

    public void setRoles(Set<Role> roles) {
	this.roles = roles;
    }

    public void setUsername(String username) {
	this.username = username;
    }
}
