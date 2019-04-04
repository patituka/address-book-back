package fr.formation.addressbook.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import fr.formation.addressbook.entities.Locality;

public class CsvReader {

    public static List<Locality> readCsvFile(String path) {
	List<Locality> addresses = new ArrayList<>();
	Path pathToFile = Paths.get(path);
	try (BufferedReader br = Files.newBufferedReader(pathToFile,
		StandardCharsets.UTF_8)) {
		br.readLine();
	    String line = br.readLine();
	    while (line != null) {
			String[] att = line.split(";");
			Locality address = createAddress(att);
			addresses.add(address);
			line = br.readLine();
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return addresses;
	// return addresses.subList(1, addresses.size());
    }

    private static Locality createAddress(String[] data) {
	String codePostal = data[2];
	String commune = data[3];
	return new Locality(codePostal, commune);
    }
}