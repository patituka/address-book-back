package fr.formation.addressbook.dtos;

import javax.validation.constraints.NotNull;

import fr.formation.addressbook.entities.Locality;
import fr.formation.addressbook.entities.Types;

/**
 * @author Administrateur
 */
public class AddressDto {

    private Types type;

    @NotNull
    private String identity;

    @NotNull
    private String identification;

    private String localisationComplement;

    @NotNull
    private String label;

    private String distributionServices;

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

    /**
     * @param locality
     */
    public void setLocality(Locality locality) {
	this.locality = locality;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("AddressDto [type=");
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
