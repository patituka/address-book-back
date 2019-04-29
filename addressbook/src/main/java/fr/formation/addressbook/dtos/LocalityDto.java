package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LocalityDto {

	@NotBlank
	private int id;

	@NotNull
	private String city;

	public LocalityDto() {
	}

	public LocalityDto(@NotBlank int id, @NotNull String city) {
		this.id = id;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
