package fr.formation.addressbook.entities;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Pat
 */
@Component
public class AddressValidator implements Validator {
    // private static final Pattern ID_PATTERN =
    // Pattern.compile("[a-zA-Z]\\w*");

    /**
     * Error messages.
     */
    private static final String ERR_ID_UNDEFINED = "Address id is undefined";

    private static final String ERR_NAME_UNDEFINED = "Address name is undefined";

    /**
     * @param clazz
     * @return
     */
    @Override
    public boolean supports(Class<?> clazz) {
	return Address.class.equals(clazz);
    }

    /**
     * @param target
     * @param errors
     */
    @Override
    public void validate(Object target, Errors errors) {
	/* Id must be defined */
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "errIdUdefined",
		ERR_ID_UNDEFINED);
	/* Name must be defined */
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
		"errNameUndefined", ERR_NAME_UNDEFINED);
	Address address = (Address) target;
	/* Check id against pattern */
	// if (!ID_PATTERN.matcher(address.getId()).matches()) {
	// errors.rejectValue("id", "errIdBadFormat", ERR_ID_BAD_FORMAT);
	// }
    }
}
