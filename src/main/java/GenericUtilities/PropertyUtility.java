package GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{	
	public String getKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/msedgedriver.exe");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
}
