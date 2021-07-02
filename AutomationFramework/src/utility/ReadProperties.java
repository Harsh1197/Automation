package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperties {

	public String propertyFolder=System.getProperty("user.dir")+"\\resources\\";
	
	/*
	 * Description:To Fetch Properties File
	 * 
	 */
	public Properties readProperties(String fileName) throws Exception{
		FileInputStream inpFile=null;
		Properties prop=null;
		try {
			inpFile=new FileInputStream(propertyFolder+fileName+".properties");
			prop=new Properties();
			prop.load(inpFile);
			
		}
		catch(FileNotFoundException nf) {
			nf.printStackTrace();
		}
		finally {
			inpFile.close();
		}
		return prop;
	}
	


























}
