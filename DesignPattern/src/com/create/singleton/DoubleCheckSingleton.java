package com.create.singleton;

/*
 * ����ʽ�����߳�ͬ����
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
