package com.create.singleton;

public class Thread2 extends Thread {
	public void run()
	{
		Singleton instance = Singleton.getInstance();
		System.out.println( instance.hashCode()+" 2");
	}

}
