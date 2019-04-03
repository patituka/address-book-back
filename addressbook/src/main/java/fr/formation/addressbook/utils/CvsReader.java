package fr.formation.addressbook.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import fr.formation.addressbook.entities.Address;

public class CvsReader {
		
	public static List<Address> readCsvFile(String path) {
		
		List<Address> addresses = new ArrayList<>(); 
		Path pathToFile = Paths.get(path);
		
		 try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
	            String line = br.readLine();
	            
	            while(line != null) {
	            	String[] att = line.split(";");
	            	Address address = createAddress(att);
	            	addresses.add(address);
	            	line = br.readLine();     	
	            }
		 } catch (IOException e) {
			e.printStackTrace();
		}	
		return addresses.subList(1, addresses.size());	
	}
	
	private static Address createAddress(String[] data) {
		String codePostal = data[2];
		String commune = data[3];
		return new Address(codePostal, commune);
		
	}
	
	
}
