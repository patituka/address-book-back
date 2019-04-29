package fr.formation.addressbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Locality extends AbstractEntity{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -6209937263508364485L;

	
	@Column(name = "nom_commune", length = 100, nullable = false)
	private String city;
    
    @Column(name = "code_postal", length = 5, nullable = false)
	private String zipCode;
    
    @Column(name = "latitude")
    private Double latitude;
    
    @Column (name= "longitude")
    private Double longitude;
    
	public String getNomCommune() {
		return city;
	}

	public void setNomCommune(String nomCommune) {
		this.city = nomCommune;
	}

	public String getCodePostal() {
		return zipCode;
	}

	public void setCodePostal(String codePostal) {
		this.zipCode = codePostal;
	}
	

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Locality(String zipCode,String city,Double latitude, Double longitude) {
		this.zipCode = zipCode;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Locality() {	}

	
}
