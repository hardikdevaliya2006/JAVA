import java.util.*;
import java.io.*;

class ThreadDemo extends Thread{
	public static void main(String []args)
	{
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		
		t.setName("bca sem - 6");
		
		System.out.println(t.getName());
		
		System.out.println("Main Thread Priority : " + t.getPriority());
		
		t.setPriority(MAX_PRIORITY);
		
		System.out.println("Main Thread Priority after changing : " + t.getPriority());
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
		
		Thread ct = new Thread()
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Child Thread");
				}
			}
		};
		
		System.out.println("Child Thread Priority : " + ct.getPriority());
		
		ct.setPriority(MIN_PRIORITY);
		
		System.out.println("Child Thread Priority after changing : " + ct.getPriority());
		
		ct.start();
	}
}

class ThreadChild extends Thread{	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thraed");
		}
	}	
}