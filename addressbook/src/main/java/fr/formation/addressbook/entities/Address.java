package fr.formation.addressbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Address extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5931394981912500386L;

	@Column(name="identity", length = 38, nullable = false) 
	private String identity;
	
	@Column(name= "identification", length= 38,nullable = false)
	private String identification;
	
	@Column(name= "localisationComplement", length= 38)
	private String localisationComplement;
	
	@Column(name= "label", length= 38,nullable = false)
	private String label;
	
	@Column(name= "distributionServices", length= 38)
	private String distributionServices;
	
	@Column(name= "zipcode", length= 5,nullable = false)
	private String zipCode;
	
	@Column(name= "locality", length= 38,nullable = false)
	private String locality;

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

	public Address() {
		
	}

	public Address(String identity, String identification, String localisationComplement, String label,
			String distributionServices, String zipCode, String locality) {
		this.identity = identity;
		this.identification = identification;
		this.localisationComplement = localisationComplement;
		this.label = label;
		this.distributionServices = distributionServices;
		this.zipCode = zipCode;
		this.locality = locality;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Addresses [identity=");
		builder.append(identity);
		builder.append(", identification=");
		builder.append(identification);
		builder.append(", localisationComplement=");
		builder.append(localisationComplement);
		builder.append(", label=");
		builder.append(label);
		builder.append(", distributionServices=");
		builder.append(distributionServices);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", locality=");
		builder.append(locality);
		builder.append("]");
		return builder.toString();
	}
	
	

	
	
	

}
