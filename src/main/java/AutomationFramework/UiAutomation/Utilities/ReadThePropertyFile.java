package AutomationFramework.UiAutomation.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadThePropertyFile {

	
	private ReadThePropertyFile() {}
	
	private static Properties property=new Properties();
	
	private static String FilePath="C:\\Users\\Abhishek\\Desktop\\Eclipse project\\UiAutomation\\src\\main\\java\\Resources\\config.properties";
	
	public static String ReadThePropertyFile() throws IOException
	{
		FileInputStream fis=new FileInputStream(FilePath);
		property.load(fis);
		return property.getProperty("url");
		
		
	}
	
	
	
}
