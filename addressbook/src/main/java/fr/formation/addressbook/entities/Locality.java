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

	
	@Column(name = "city", length = 100, nullable = false)
	private String city;
    
    @Column(name = "zipCode", length = 5, nullable = false)
	private String zipCode;
    
    @Column (name = "district")
    private String district;
    
    @Column(name = "latitude")
    private Double latitude;
    
    @Column (name= "longitude")
    private Double longitude;
    
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Locality(String zipCode,String city,String district,Double latitude, Double longitude) {
		this.zipCode = zipCode;
		this.city = city;
		this.district = district;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Locality() {	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Locality [city=");
		builder.append(city);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", district=");
		builder.append(district);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append("]");
		return builder.toString();
	}

	
	
}
