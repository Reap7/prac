package com.create.singleton;

public class MyThread extends Thread {
	
	public void run()
	{
		SingletonA a = SingletonA.getInstance();
		System.out.println(a.hashCode()+" a");
	}

}
