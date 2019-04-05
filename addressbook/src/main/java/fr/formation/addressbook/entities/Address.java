package fr.formation.addressbook.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address extends AbstractEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -5931394981912500386L;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Types type;

    @Column (length = 38, nullable = false)
    private String identity;

    @Column(length = 38, nullable = false)
    private String identification;

    @Column(length = 38)
    private String localisationComplement;

    @Column(length = 38, nullable = false)
    private String label;

    @Column(length = 38)
    private String distributionServices;

   @ManyToOne
    private Locality locality;

    public Types getTypes() {
	return type;
    }

    public void setTypes(Types type) {
	this.type = type;
    }

    public String getIdentity() {
	return identity;
    }

    public void setIdentity(String identity) {
	this.identity = identity;
    }

    public String getIdentification() {
	return identification;
    }

    public void setIdentification(String identification) {
	this.identification = identification;
    }

    public String getLocalisationComplement() {
	return localisationComplement;
    }

    public void setLocalisationComplement(String localisationComplement) {
	this.localisationComplement = localisationComplement;
    }

    public String getLabel() {
	return label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public String getDistributionServices() {
	return distributionServices;
    }

    public void setDistributionServices(String distributionServices) {
	this.distributionServices = distributionServices;
    }

    public Locality getLocality() {
	return locality;
    }

    public void setLocality(Locality locality) {
	this.locality = locality;
    }

    public Address() {
    }

    public Address(Types type, String identity, String identification,
	    String localisationComplement, String label,
	    String distributionServices, Locality locality) {
	super();
	this.type = type;
	this.identity = identity;
	this.identification = identification;
	this.localisationComplement = localisationComplement;
	this.label = label;
	this.distributionServices = distributionServices;
	this.locality = locality;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Address [types=");
	builder.append(type);
	builder.append(", identity=");
	builder.append(identity);
	builder.append(", identification=");
	builder.append(identification);
	builder.append(", localisationComplement=");
	builder.append(localisationComplement);
	builder.append(", label=");
	builder.append(label);
	builder.append(", distributionServices=");
	builder.append(distributionServices);
	builder.append(", locality=");
	builder.append(locality);
	builder.append("]");
	return builder.toString();
    }
}
