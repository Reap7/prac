package com.create.simpleFactory.factory.reflection.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties implements LoadConfig {

	private String m_ConfigPath = null;
	
	/*
	 * Constructor
	 */
	LoadProperties()
	{
		setConfigPath("class.properties");
	}
	
	public void setConfigPath(String configPath) {
		m_ConfigPath = configPath;
	}


	@Override
	public String getType(String bean_name) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		InputStream in = null;
		
		in = LoadProperties.class.getResourceAsStream( m_ConfigPath );
		
		try 
		{
			p.load(in);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			try 
			{
				in.close();
			} catch (IOException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}
		
		return p.getProperty(bean_name);
	}
	

}
