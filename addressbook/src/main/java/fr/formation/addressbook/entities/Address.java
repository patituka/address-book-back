package fr.formation.addressbook.entities;

import javax.persistence.Column;

public class Address extends AbstractEntity{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -6209937263508364485L;

	@Column(length = 100, nullable = false)
	private String nomCommune;
    
    @Column(length = 100, nullable = false)
	private String CodePostal;

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public String getCodePostal() {
		return CodePostal;
	}

	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}
    
  
	
	
	

}
