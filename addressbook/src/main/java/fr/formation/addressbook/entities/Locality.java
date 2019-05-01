package fr.formation.addressbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrateur
 */
@Entity
public class Locality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String city;

    @Column(length = 10, nullable = false)
    private String zipCode;

    @Column(nullable = true)
    private Double coordinateX;

    @Column(nullable = true)
    private Double coordinateY;

    /**
     *
     */
    public Locality() {
    }

    /**
     * @param city
     * @param zipCode
     * @param coordinateX
     * @param coordinateY
     */
    public Locality(String zipCode, String city, Double coordinateX,
	    Double coordinateY) {
	this.zipCode = zipCode;
	this.city = city;
	this.coordinateX = coordinateX;
	this.coordinateY = coordinateY;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public Double getCoordinatesX() {
	return coordinateX;
    }

    public void setCoordinateX(Double coordinateX) {
	this.coordinateX = coordinateX;
    }

    public Double getCoordinateY() {
	return coordinateY;
    }

    public void setCoordinateY(Double coordinateY) {
	this.coordinateY = coordinateY;
    }
}
