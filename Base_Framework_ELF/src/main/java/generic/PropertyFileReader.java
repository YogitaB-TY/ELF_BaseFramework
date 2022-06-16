package generic;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * @author Yogita
 *
 */

public class PropertyFileReader  {
	
	/**
	 * This method read the properties and return the value based on key
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String  getValueProperty(String key) throws Throwable {
		FileInputStream file=new FileInputStream(FrameworkConstants.PROPERTIES_PATH);
		Properties properties=new Properties();
		properties.load(file);
		return properties.getProperty(key);
	}

}
