package com.ny.TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {
	

		private Properties prop;

		public Properties property() throws IOException
		{
			String filePath = "./src/test/resources/browser-config.properties";
			prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(filePath);
				prop.load(fis);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			return prop;
		}
	}

