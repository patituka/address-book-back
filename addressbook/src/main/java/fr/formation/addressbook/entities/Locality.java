package fr.formation.addressbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Locality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_commune", length = 100, nullable = false)
    private String city;

    @Column(name = "code_postal", length = 5, nullable = false)
    private String zipCode;

    public String getNomCommune() {
	return city;
    }

    public void setNomCommune(String nomCommune) {
	city = nomCommune;
    }

    public String getCodePostal() {
	return zipCode;
    }

    public void setCodePostal(String codePostal) {
	zipCode = codePostal;
    }

    public Locality(String codePostal, String nomCommune) {
	city = nomCommune;
	zipCode = codePostal;
    }

    public Locality() {
    }

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

    public Long getId() {
	return id;
    }

    public String getCity() {
	return city;
    }

    public String getZipCode() {
	return zipCode;
    }
}
