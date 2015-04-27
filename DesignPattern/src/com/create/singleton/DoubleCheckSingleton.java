package com.create.singleton;

/*
 * 懒汉式（多线程同步）
 */

public class DoubleCheckSingleton {
	private static DoubleCheckSingleton instance = null;
	
	
	public static DoubleCheckSingleton getInstance()
	{
		/*
		 * 
		 */
		
		if( instance == null )
		{
			synchronized(DoubleCheckSingleton.class)
			{
				if( instance == null)
				instance = new DoubleCheckSingleton();
			}
		}
		
		return instance;
	}
	
	/*Private Constructor*/
	private DoubleCheckSingleton()
	{
		//TO DO something to initialize
	}
}
