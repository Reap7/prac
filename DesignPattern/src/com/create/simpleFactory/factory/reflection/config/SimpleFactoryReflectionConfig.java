package com.create.simpleFactory.factory.reflection.config;

import com.create.simpleFactory.product.Translate;

public class SimpleFactoryReflectionConfig {
	
	public Translate getTranslate(String bean_name,LoadConfig loadConfig)
	{
		Translate translate = null;
		try {
			translate = (Translate)Class.forName( loadConfig.getType(bean_name) ).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return translate;
	}//end methodS
	

}
