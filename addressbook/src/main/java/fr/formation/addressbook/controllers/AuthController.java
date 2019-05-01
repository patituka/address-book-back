package fr.formation.addressbook.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.entities.User;

/**
 * @author Administrateur
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    private static final Logger LOGGER = LoggerFactory
	    .getLogger(AuthController.class);

    @Autowired
    private UserDetailsService userService;

    /**
     * @return
     */
    @RequestMapping({ "/validateLogin" })
    public User validateLogin(Authentication authentication) {
	LOGGER.info("validateLogin as been called");
	return new User("User successfully authenticated");
    }
}
