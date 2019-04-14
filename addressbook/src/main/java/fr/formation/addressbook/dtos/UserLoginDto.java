package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotBlank;

/**
 * @author Administrateur
 */
public class UserLoginDto {

    @NotBlank
    String email;

    @NotBlank
    String password;
}
