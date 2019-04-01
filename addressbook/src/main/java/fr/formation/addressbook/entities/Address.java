package fr.formation.addressbook.entities;

import javax.persistence.Column;

import org.hibernate.annotations.Columns;

public class Address {
	
    @Column(length = 100, nullable = false)
	private String codeCommuneINSEE;
    
    @Column(length = 100, nullable = false)
	private String nomCommune;
    
    @Column(length = 100, nullable = false)
	private String CodePostal;
    
    @Column(length = 100, nullable = false)
	private String libelle;
    
    @Column(length = 100, nullable = false)
	private String coordonneesGPS;
	
	
	
	public String getCodeCommuneINSEE() {
		return codeCommuneINSEE;
	}
	public void setCodeCommuneINSEE(String codeCommuneINSEE) {
		this.codeCommuneINSEE = codeCommuneINSEE;
	}
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
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getCoordonneesGPS() {
		return coordonneesGPS;
	}
	public void setCoordonneesGPS(String coordonneesGPS) {
		this.coordonneesGPS = coordonneesGPS;
	}
	
	
	

}
