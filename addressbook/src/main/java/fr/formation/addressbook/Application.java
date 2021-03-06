package fr.formation.addressbook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
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
	 private static final Logger logger = LogManager.getLogger(Application.class);
    /**
     * @param args
     */
    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
	logger.info("starting application...");
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
