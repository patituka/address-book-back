package fr.formation.addressbook.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    private static final String CSVFile = "C:\\Users\\Administrateur\\git\\AddressBookBack\\addressbook\\src\\main\\resources\\META-INF\\laposte_hexasmal.csv";

    public static void main(String[] args) {

	BufferedReader bufferedreader = null;
	FileReader filereader = null;

	try {
	    filereader = new FileReader(CSVFile);
	    bufferedreader = new BufferedReader(filereader);

	    String strCurrentLine;

	    while ((strCurrentLine = bufferedreader.readLine()) != null) {
		System.out.println(strCurrentLine);
	    }

	} catch (IOException exception) {

	    exception.printStackTrace();

	} finally {

	    try {

		if (bufferedreader != null)
		    bufferedreader.close();

		if (filereader != null)
		    filereader.close();

	    } catch (IOException exception) {
		exception.printStackTrace();
	    }

	}

    }

}
