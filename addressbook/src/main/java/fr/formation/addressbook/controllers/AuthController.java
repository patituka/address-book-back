package fr.formation.addressbook.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.addressbook.entities.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping({ "/validateLogin" })
    public User validateLogin() {
	return new User("User successfully authenticated");
    }
}
