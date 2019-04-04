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
    
    @Column(name = "code_postal", length = 100, nullable = false)
	private String zipCode;

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

	public Locality(String codePostal, String nomCommune) {
		this.city = nomCommune;
		this.zipCode = codePostal;
	}

	public Locality() {	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [commune=");
		builder.append(city);
		builder.append(", codePostal=");
		builder.append(zipCode);
		builder.append("]");
		return builder.toString();
	}
}
