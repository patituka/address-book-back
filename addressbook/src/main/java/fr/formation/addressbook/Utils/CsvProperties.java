package fr.formation.addressbook.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Administrateur
 */
@PropertySource("classpath:csv.properties")
@Configuration
public class CsvProperties {

    @Value("${csv.url}")
    private String csvUrl;

    /**
     * @return path csv addressBook
     */
    public String getCsvUrl() {
	return csvUrl;
    }
}
