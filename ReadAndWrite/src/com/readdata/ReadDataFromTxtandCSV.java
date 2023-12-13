package com.readdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTxtandCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Step 1 - Create an object of FileReader class or using File class
		//File f = new File("/Users/shraddhashetty/eclipse-workspace/ReadAndWrite/src/com/properties/TestDataTXT.txt");
		File f = new File("/Users/shraddhashetty/eclipse-workspace/ReadAndWrite/src/com/properties/TestDataCSV.csv");
		FileReader fr = new FileReader(f);

		
		//step 2 - Create object of BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		//step 3 - read data
		System.out.println(br.readLine());
		System.out.println(br.readLine()); // to read the second line
		
		
		//step 4 - close the file
		System.out.println("Read successfully");
		br.close();
	}

}

/*
 * https://javadoc.io/doc/io.rest-assured/rest-assured/3.0.1/io/restassured/internal/support/FileReader.html
 */
