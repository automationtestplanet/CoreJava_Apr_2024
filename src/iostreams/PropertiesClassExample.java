package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassExample {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\InputData\\test.properties")));
		
		System.out.println(prop.getProperty("first.name"));
		System.out.println(prop.getProperty("qualification"));
		
		FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.dir")+"\\InputData\\test.properties"));
		
		prop.setProperty("age", "25");
		
		
		prop.store(fos, "Updated by Raju");

	}

}
