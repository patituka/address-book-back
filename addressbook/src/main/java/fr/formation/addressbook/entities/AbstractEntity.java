package fr.formation.addressbook.entities;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
   

    /**
     * Creates a new {@code AbstractEntity} with {@code null} id and optimistic
     * lock.
     */
    protected AbstractEntity() {    }


    protected Long getId() {
	return id;
    }

    @SuppressWarnings("unused")
    private void setId(Long id) {
	this.id = id;
    }
}
