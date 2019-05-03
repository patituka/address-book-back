package fr.formation.addressbook.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.formation.addressbook.entities.Locality;

/**
 * @author Administrateur
 */
public class CsvReader {

    private static final Logger LOGGER = LoggerFactory
	    .getLogger(CsvReader.class);

    /**
     * @param path
     * @return
     */
    public static List<Locality> readCsvFile(String path) {
	LOGGER.info("CSV readed is loading");
	List<Locality> localities = new ArrayList<>();
	Path pathToFile = Paths.get(path);
	try (BufferedReader br = Files.newBufferedReader(pathToFile,
		StandardCharsets.UTF_8)) {
	    String header = br.readLine();
	    System.out.println(header);
	    String line = br.readLine();
	    System.out.println(line);
	    while (line != null) {
		String[] att = line.split(";", -1);
		Locality locality = createAddress(att);
		localities.add(locality);
		line = br.readLine();
	    }
	} catch (IOException e) {
	    LOGGER.error(e.getMessage() + " " + e.getCause());
	    e.printStackTrace();
	}
	LOGGER.info("Csv added in database");
	return localities;
    }

    private static Locality createAddress(String[] data) {
	// Arrays.stream(data).forEach(System.out::println);
	String zipCode = data[2];
	String city = data[3];
	String[] coordinates;
	Double coordinateX;
	Double coordinateY;
	if (data[5].isEmpty() || data[5].equals("")) {
	    coordinateX = 0.0;
	    coordinateY = 0.0;
	} else {
	    coordinates = data[5].split(",");
	    coordinateX = Double.valueOf(coordinates[0]);
	    coordinateY = Double.valueOf(coordinates[1]);
	}
	return new Locality(zipCode, city, coordinateX, coordinateY);
    }

    public static List<?> csvToEntity(String path, String entity) {
	List<Class<?>> list = new ArrayList<>();
	Path pathToFile = Paths.get(path);
	BufferedReader br;
	try {
	    br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);
	    br.readLine();
	    String line = br.readLine();
	    while (line != null) {
		Class<?> classe = Class
			.forName("fr.formation.addressbook.entities." + entity);
		Field[] classFields = classe.getDeclaredFields();
		Arrays.stream(classFields).forEach(System.out::println);
		String[] att = line.split(";");
		classe = createClass(att);
		list.add(classe);
		line = br.readLine();
	    }
	} catch (IOException e1) {
	    e1.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
	return null;
    }

    private static Class<?> createClass(String[] att) {
	return null;
    }
}
