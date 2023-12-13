package com.readdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Step 1 - Create an object of FileWriter class or FileOutputstream
		//FileWriter fw = new FileWriter("/Users/shraddhashetty/eclipse-workspace/ReadAndWrite/src/com/properties/TestDataNew.properties", true);
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/src/com/properties/TestDataNewNew.properties", true);
		//if true is not mentioned here then it will overwrite the existing file
		
		//step 2 - create an object of properties class
		Properties p = new Properties();
		
		
		//step 3 - use set property method to set the properties inside the file and use .store
		p.setProperty("browser", "firefox");
		//p.store(fw, "Sample comments");
		p.store(fos, "Sample write comments");
	}

}
