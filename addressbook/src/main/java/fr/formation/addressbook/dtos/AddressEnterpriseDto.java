package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddressEnterpriseDto {
	
	@NotBlank @NotNull
	private String types;
	
	@NotBlank @NotNull
	private String identity;
	
	@NotBlank @NotNull
	private String identification;
	
	
	private String localisationComplement;
	
	@NotBlank @NotNull
	private String label;
	
	
	private String distributionServices;
	
	@NotBlank @NotNull
	private String zipCode;
	
	@NotBlank @NotNull
	private String locality;

	public AddressEnterpriseDto() {
		
	}
	
	
	
	
	

}
