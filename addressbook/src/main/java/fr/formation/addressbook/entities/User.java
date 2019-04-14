package fr.formation.addressbook.entities;

import javax.persistence.Entity;

/**
 * @author Administrateur
 */
@Entity
public class User extends AbstractEntity {

    private static final long serialVersionUID = -7775089429147888349L;

    private String status;

    private String username;

    private String password;

    private String email;

    /**
     * @param status
     */
    public User(String status) {
	this.status = status;
    }

    /**
     * @return
     */
    public String getStatus() {
	return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
	this.status = status;
    }
}
