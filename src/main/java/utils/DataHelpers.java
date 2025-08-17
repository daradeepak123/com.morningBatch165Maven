package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataHelpers {
	
	public static String readDataPropFile(String prop) throws Exception {
		
		File file=new File(System.getProperty("user.dir")+"/src/test/resources/config.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties config=new Properties();
		config.load(fis);
		return config.getProperty(prop);
	}
	
	public static Properties retPropFile(String path) throws Exception {
		
		File file=new File(System.getProperty("user.dir")+path);
		FileInputStream fis=new FileInputStream(file);
		Properties config=new Properties();
		config.load(fis);
		return config;
	}

}
