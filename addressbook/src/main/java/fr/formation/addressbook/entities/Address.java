package fr.formation.addressbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * @author Administrateur
 */
@Entity
@SuppressWarnings("javadoc")
public class Address extends AbstractEntity {

    /**
     *
     */
    private static final long serialVersionUID = -5931394981912500386L;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Types type;

    @Column(length = 255, nullable = false)
    private String identity;

    @Column(length = 255, nullable = false)
    private String street;

    @Column(length = 255)
    private String streetComplement;

    @Column(length = 40)
    private String label;

    @Column(length = 40)
    private String building;

    @ManyToOne
    private Locality locality;

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
    public Address(Types type, String identity, String street,
	    String streetComplement, String label, String building,
	    Locality locality) {
	this.type = type;
	this.identity = identity;
	this.street = street;
	this.streetComplement = streetComplement;
	this.label = label;
	this.building = building;
	this.locality = locality;
    }

    public Address() {
    }

    /**
     * @return
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Address [type=");
	builder.append(type);
	builder.append(", identity=");
	builder.append(identity);
	builder.append(", street=");
	builder.append(street);
	builder.append(", streetComplement=");
	builder.append(streetComplement);
	builder.append(", label=");
	builder.append(label);
	builder.append(", building=");
	builder.append(building);
	builder.append(", locality=");
	builder.append(locality);
	builder.append("]");
	return builder.toString();
    }
}
