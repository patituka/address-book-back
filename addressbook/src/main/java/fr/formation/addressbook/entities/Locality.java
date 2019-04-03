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

	
	@Column(name = "Nom_commune", length = 100, nullable = false)
	private String nomCommune;
    
    @Column(name = "Code_postal", length = 100, nullable = false)
	private String codePostal;

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public Locality(String codePostal, String nomCommune) {
		this.nomCommune = nomCommune;
		this.codePostal = codePostal;
	}

	public Locality() {	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [commune=");
		builder.append(nomCommune);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append("]");
		return builder.toString();
	}
}
