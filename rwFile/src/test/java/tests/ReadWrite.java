package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("/Users/shraddhashetty/eclipse-workspace/rwFile/src/test/resources/properties/testdata.properties");
		//to read the data from the properties file we use properties.load
		properties.load(inputstream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputstream = new FileOutputStream("/Users/shraddhashetty/eclipse-workspace/rwFile/src/test/resources/properties/testdata.properties");
		properties.setProperty("testdata", "23456");
		//to write the data to the properties file we use properties.store
		properties.store(outputstream, "comments added");
		

	}

}
