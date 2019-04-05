package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotNull;

public class LocalityDto {

    @NotNull
    private String id;

    @NotNull
    private String city;

    public LocalityDto() {
    }

    public LocalityDto(@NotNull String id, @NotNull String city) {
	this.id = id;
	this.city = city;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }
}
