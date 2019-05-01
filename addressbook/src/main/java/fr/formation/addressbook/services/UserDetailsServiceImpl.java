package fr.formation.addressbook.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author Administrateur
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username)
	    throws UsernameNotFoundException {
	return null;
    }
}
