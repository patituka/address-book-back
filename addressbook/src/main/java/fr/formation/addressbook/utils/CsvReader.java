package fr.formation.addressbook.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.validator.constraints.Length;

import fr.formation.addressbook.entities.Locality;

public class CsvReader {
	
	private static final Logger logger = LogManager.getLogger(CsvReader.class);
	
    public static List<Locality> readCsvFile(String path) {
	List<Locality> addresses = new ArrayList<>();
	Path pathToFile = Paths.get(path);
	try (BufferedReader br = Files.newBufferedReader(pathToFile,
		StandardCharsets.UTF_8)) {
		br.readLine();
	    String line = br.readLine();
	    logger.info("Database created");
	    while (line != null) {
			String[] att = line.split(";",-1);
			Locality address = createAddress(att);
			addresses.add(address);
			line = br.readLine();
	    }
	} catch (IOException e) {
		logger.error("the file is malformated or unmapped");
		
	    e.printStackTrace();
	}
	logger.info("Database created");
	return addresses;
	
    }

    private static Locality createAddress(String[] data) {
	String zipCode = data[2];
	String city = data[3];
	String coordinates =data[5];
	Double latitude =0.0;
	Double longitude = 0.0;
	if (coordinates.isEmpty()) { coordinates = "0,0";} else { 
		latitude = Double.valueOf(coordinates.split(",")[0]);
		longitude = Double.valueOf(coordinates.split(",")[1]);};
	return new Locality(zipCode, city, latitude, longitude );
    }
}