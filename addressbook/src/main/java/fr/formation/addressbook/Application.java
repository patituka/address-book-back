package fr.formation.addressbook;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fr.formation.addressbook.repositories.AddressRepository;
import fr.formation.addressbook.utils.CsvProperties;
import fr.formation.addressbook.utils.CvsReader;

/**
 * @author Administrateur
 */
@SpringBootApplication
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }

    /**
     * Configure the database with the csv file
     */
    @Component
    public class DbInit {

	@Autowired
	private AddressRepository repository;

	@Autowired
	private CsvProperties properties;

	@PostConstruct
	private void postConstruct() {
	    repository.saveAll(CvsReader.readCsvFile(properties.getCsvUrl()));
	}
    }

    @Bean
    protected WebMvcConfigurer webMvcConfigurer() {
	return new WebMvcConfigurer() {

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*")
			.allowedMethods("*");
	    }
	};
    }
}
