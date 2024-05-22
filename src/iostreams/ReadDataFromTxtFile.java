package iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ReadDataFromTxtFile {

	public static void main(String[] args) throws Exception {
		
		System.out.println(System.getProperty("user.dir"));	
		
		File flie1 = new File(System.getProperty("user.dir")+"\\InputData\\File1.txt");
		
		FileInputStream fis = new FileInputStream(flie1);
		
		System.out.println(fis.available());
		
		byte[] byteArr = new byte[fis.available()];
		
		fis.read(byteArr);
		
		String str = new String(byteArr);
		
		System.out.println(str);
		
		FileReader fileRead = new FileReader(System.getProperty("user.dir")+"\\InputData\\File1.txt");
		
		
		
		BufferedReader bufReader = new BufferedReader(fileRead);
		int i = 1;
		String outputData = "";
		
		while(bufReader.ready()) {			
			outputData+=bufReader.readLine()+" New Data"+" ";			
//			System.out.println("Line "+ i);
//			System.out.println(bufReader.readLine()); 
			i++;			
		}
	
		System.out.println(outputData);
		
		FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.dir")+"\\InputData\\File2.txt"));
		
		byte[] outputByteArr = outputData.getBytes();
		
		fos.write(outputByteArr);
		fos.flush();
		fos.close();
		

	}

}
