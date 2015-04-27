package com.create.simpleFactory.client;

import com.create.simpleFactory.factory.*;
import com.create.simpleFactory.factory.reflection.*;
import com.create.simpleFactory.product.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translate translate = null;
		SimpleFactory simpleFactory = new SimpleFactory();
		SimpleFactoryReflection simpleFactoryReflection = new SimpleFactoryReflection();
		
		translate = simpleFactory.getTranslate(1);
		System.out.println( translate.sayTxt("≤‚ ‘"));
		translate = simpleFactoryReflection.getTranslate("com.simpleFactory.production.ChineseTranslate");
		System.out.println( translate.sayTxt("≤‚ ‘"));
		
		
		translate  = simpleFactory.getTranslate(2);
		System.out.println( translate.sayTxt("Test"));
		translate = simpleFactoryReflection.getTranslate("com.simpleFactory.production.EnglishTranslate");
		System.out.println( translate.sayTxt("Test"));
		/**	new requirement  */
		//new factory
		simpleFactory = new SimpleFactoryA();
		
		translate = simpleFactory.getTranslate(3);
		System.out.println( translate.sayTxt("New"));
		translate = simpleFactoryReflection.getTranslate("com.simpleFactory.production.NewTranslate");
		System.out.println( translate.sayTxt("New"));		

	}

}
