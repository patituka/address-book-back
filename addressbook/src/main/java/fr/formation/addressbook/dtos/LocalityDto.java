package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LocalityDto {

    @NotBlank
    @NotNull
    private String zipCode;

    @NotBlank
    @NotNull
    private String city;

    public LocalityDto() {
    }

    public LocalityDto(String zipCode, String city) {
	this.zipCode = zipCode;
	this.city = city;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }
}
