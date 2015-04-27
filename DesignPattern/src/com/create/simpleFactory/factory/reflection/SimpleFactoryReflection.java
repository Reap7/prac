package com.create.simpleFactory.factory.reflection;

import com.create.simpleFactory.product.Translate;

public class SimpleFactoryReflection {
	/*
	 * without config
	 */
	
	public Translate getTranslate(String class_name_complete)
	{
		Translate translate = null;
		
		try {
			translate = (Translate)Class.forName(class_name_complete).newInstance();
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
	}//end method
	
	

}
