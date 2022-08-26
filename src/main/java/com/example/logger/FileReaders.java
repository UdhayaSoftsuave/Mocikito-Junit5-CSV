package com.example.logger;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

public class FileReaders {
	
	// Java code to illustrate reading a
	// CSV file line by line
	public static void readDataLineByLine(String file)
	{

		//write the data in existing csv file
		try {
			
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// file reader as a parameter
			CSVReader csvReader = new CSVReader(filereader);
	        
	        List<String[]> allData = csvReader.readAll();
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file);
	  
	        // create CSVWriter object filewriter object as parameter
	        CSVWriter writer = new CSVWriter(outputfile);
	  
//	        // adding header to csv
//	        String[] header = { "Name", "Class", "Marks" };
//	        writer.writeNext(header);
	  
	        // add data to csv
	        
	        
	        String[] data1 = { "7777","44444","666","NULdgL,drtfgdsv","dg","fgddfg","8/18/2022 15:39","NULL","NULL","NULL","NULL","13.026261","80.149783","NULL","NULL","NULL","NULL","13.026261","80.149783","dfg","fdg","dfgdfgd"
};
	        allData.add(data1);
	        writer.writeAll(allData);
//	        String[] data2 = { "Suraj", "10", "630" };
//	        writer.writeNext(data2);
	  
	        // closing writer connection
	        writer.close();
	    }
	    catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		

		
		//read the data 
		try {

			// Create an object of filereader
			// class with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// file reader as a parameter
			CSVReader csvReader = 
					new CSVReaderBuilder(filereader).withSkipLines(0).build();
			String[] nextRecord;

			// we are going to read data line by line
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		readDataLineByLine("C:\\Users\\softsuave\\Documents\\dumps\\practice\\demo.csv");
		
	}
	

}
