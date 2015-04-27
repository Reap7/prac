package com.create.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = new Thread();
//		Thread thread2 = new Thread();
//		
//		System.out.println(thread.hashCode());
//		System.out.println(thread2.hashCode());
//		System.out.println();
//		
//		Singleton sing1 = Singleton.getInstance();
//		Singleton sing2 = Singleton.getInstance();
//		
//		System.out.println(sing1.hashCode());
//		System.out.println(sing2.hashCode());
//		System.out.println();
		
		
			MyThread myT1 = new MyThread();
			MyThread myT2 = new MyThread();
			MyThread myT3 = new MyThread();
			MyThread myT11 = new MyThread();
			MyThread myT21 = new MyThread();
			MyThread myT31 = new MyThread();
			myT1.start();System.out.println(myT1.getName());
			myT2.start();System.out.println(myT2.getName());
			myT3.start();System.out.println(myT3.getName());
			myT11.start();System.out.println(myT11.getName());
			myT21.start();System.out.println(myT21.getName());
			myT31.start();System.out.println(myT31.getName());
			System.out.println();
			
			Thread2 t1 = new Thread2();
			System.out.println("before start,t1 isAlive:"+t1.isAlive());
			Thread2 t2 = new Thread2();
			Thread2 t3 = new Thread2();
			Thread2 t4 = new Thread2();
			Thread2 t5 = new Thread2();
			Thread2 t6 = new Thread2();
			t1.start();System.out.println("after start,t1 isAlive:"+t1.isAlive());System.out.println(t1.getName());
			t2.start();System.out.println(t2.getName());
			t3.start();System.out.println(t3.getName());
			t4.start();System.out.println(t4.getName());
			t5.start();System.out.println(t5.getName());
			t6.start();System.out.println(t6.getName());
			
			myT1.setName("myT1");System.out.println(myT1.getName());
			t6.setName("t6");System.out.println(t6.getName());
			
			Thread tt = new Thread(t1,"t1");
			System.out.println(tt.getName());
			Thread tt2 = new Thread(t1,"t11");
			System.out.println(tt2.getName());
			System.out.println("tt hashCode:"+tt.hashCode());
			System.out.println("tt2 hashCode:"+tt2.hashCode());
			System.out.println("num of active threads:"+Thread.activeCount());
	}

}
