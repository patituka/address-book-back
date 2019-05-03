package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotNull;

import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.entities.Types;

/**
 * @author Administrateur
 */
public class AddressDto {

    @NotNull
    private Types type;

    @NotNull
    private String identity;

    @NotNull
    private String street;

    private String streetComplement;

    private String label;

    private String building;

    @NotNull
    private Locality locality;

    public AddressDto() {
    }

    public Types getType() {
	return type;
    }

    public void setType(Types type) {
	this.type = type;
    }

    public String getIdentity() {
	return identity;
    }

    public void setIdentity(String identity) {
	this.identity = identity;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getStreetComplement() {
	return streetComplement;
    }

    public void setStreetComplement(String streetComplement) {
	this.streetComplement = streetComplement;
    }

    public String getLabel() {
	return label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public String getBuilding() {
	return building;
    }

    public void setBuilding(String building) {
	this.building = building;
    }

    public Locality getLocality() {
	return locality;
    }

    public void setLocality(Locality locality) {
	this.locality = locality;
    }

    /**
     * @param type
     * @param identity
     * @param street
     * @param streetComplement
     * @param label
     * @param building
     * @param locality
     */
    public AddressDto(Types type, @NotNull String identity,
	    @NotNull String street, String streetComplement,
	    @NotNull String label, String building, Locality locality) {
	super();
	this.type = type;
	this.identity = identity;
	this.street = street;
	this.streetComplement = streetComplement;
	this.label = label;
	this.building = building;
	this.locality = locality;
    }
}
