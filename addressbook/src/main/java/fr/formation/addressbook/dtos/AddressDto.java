package fr.formation.addressbook.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import fr.formation.addressbook.entities.Types;


public class AddressDto {
	
	private Types types  ;
	
	@NotBlank @NotNull
	private String identity;
	
	@NotBlank @NotNull
	private String identification;
	
	
	private String localisationComplement;
	
	@NotBlank @NotNull
	private String label;
	
	
	private String distributionServices;
	

	private String zipCode;
	
	
	private String locality;

	public AddressDto() {
		
	}

	public Types getTypes() {
		return types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getLocalisationComplement() {
		return localisationComplement;
	}

	public void setLocalisationComplement(String localisationComplement) {
		this.localisationComplement = localisationComplement;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDistributionServices() {
		return distributionServices;
	}

	public void setDistributionServices(String distributionServices) {
		this.distributionServices = distributionServices;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	
	
	
	
	
	

}
