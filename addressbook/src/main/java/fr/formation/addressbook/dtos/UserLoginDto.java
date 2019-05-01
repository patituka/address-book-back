package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotBlank;

/**
 * @author Administrateur
 */
public class UserLoginDto {

    @NotBlank
    String email;

    @NotBlank
    String username;

    @NotBlank
    String password;

    /**
     *
     */
    public UserLoginDto() {
    }

    /**
     * @param email
     * @param password
     */
    public UserLoginDto(String email, String password) {
	this.email = email;
	this.password = password;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("UserLoginDto [email=");
	builder.append(email);
	builder.append(", password=");
	builder.append(password);
	builder.append("]");
	return builder.toString();
    }
}
