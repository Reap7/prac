package com.create.singleton;

/*
 * ����ʽ
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
