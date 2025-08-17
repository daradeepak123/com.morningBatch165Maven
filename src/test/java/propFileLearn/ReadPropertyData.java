package propFileLearn;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import utils.DataHelpers;

public class ReadPropertyData {

	public static void main(String[] args) throws Exception {
		
//		File file=new File(System.getProperty("user.dir")+"/src/test/resources/config.properties");
//		FileInputStream fis=new FileInputStream(file);
//		
//		Properties config=new Properties();
//		
//		config.load(fis);
//		
//		System.out.println(config.getProperty("browser"));
		
		String pro=DataHelpers.readDataPropFile("browser");
		System.out.println(pro);
	}

}
