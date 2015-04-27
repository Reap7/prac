package com.create.singleton;

/*
 * ¶öººÊ½
 */

public class Singleton {
	private static  Singleton instance  = new Singleton();
	
	public static Singleton getInstance()
	{
		return instance;
	}
	
	/* Private Constructor*/
	private Singleton()
	{
		//TO DO something
	}

}
