package fr.formation.addressbook;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Administrateur
 */
@SpringBootApplication
public class Application {

    private static final Logger LOGGER = LoggerFactory
	    .getLogger(Application.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
	LOGGER.info("starting application...");
	// CsvReader.csvToEntity("path", "Locality");
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

    @Bean
    protected ModelMapper mapper() {
	ModelMapper mapper = new ModelMapper();
	mapper.getConfiguration().setFieldMatchingEnabled(true)
		.setFieldAccessLevel(AccessLevel.PRIVATE);
	return mapper;
    }
}
