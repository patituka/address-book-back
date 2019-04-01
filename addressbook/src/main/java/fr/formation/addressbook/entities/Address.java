package fr.formation.addressbook.entities;

import javax.persistence.Column;

public class Address extends AbstractEntity{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -6209937263508364485L;

	@Column(name = "Nom_commune", length = 100, nullable = false)
	private String commune;
    
    @Column(name = "Code_postal", length = 100, nullable = false)
	private String codePostal;

	public String getNomCommune() {
		return commune;
	}

	public void setNomCommune(String nomCommune) {
		this.commune = nomCommune;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public Address(String commune, String codePostal) {
		this.commune = commune;
		this.codePostal = codePostal;
	}

	public Address() {	}
	
	
    
  
	
	
	

}
