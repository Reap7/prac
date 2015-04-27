package com.create.singleton;

public class SingletonA {
	private static SingletonA instance = null;
	
	public static SingletonA getInstance()
	{
		if(  instance == null )
		{
			synchronized(SingletonA.class)
			{
				instance = new SingletonA();
			}
		}
		
		return instance;
	}
	
	private SingletonA()
	{
		//TO DO something
	}

}
