package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotNull;

/**
 * @author Administrateur
 */
public class LocalityDto {

    @NotNull
    private String id;

    @NotNull
    private String city;

    private String zipCode;

    private Double coordinateX;

    private Double coordinateY;

    /**
     *
     */
    public LocalityDto() {
    }

    /**
     * @param id
     * @param zipCode
     * @param city
     * @param coordinateX
     * @param coordinateY
     */
    public LocalityDto(@NotNull String id, String city, String zipCode,
	    Double coordinateX, Double coordinateY) {
	this.id = id;
	this.zipCode = zipCode;
	this.city = city;
	this.coordinateX = coordinateX;
	this.coordinateY = coordinateY;
    }

    /**
     * @return
     */
    public String getCity() {
	return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
	this.city = city;
    }

    /**
     * @return
     */
    public String getId() {
	return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * @param coordinates
     */
    public void setCoordonatesX(Double coordinateX) {
	this.coordinateX = coordinateX;
    }

    public Double getCoordinateX() {
	return coordinateX;
    }

    /**
     * @return
     */
    public Double getCoordinateY() {
	return coordinateY;
    }

    /**
     * @param coordinates
     */
    public void setCoordonateY(Double coordinateY) {
	this.coordinateY = coordinateY;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }
}
