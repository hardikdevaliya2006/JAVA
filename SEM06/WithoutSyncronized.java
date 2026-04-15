class First
{
	public void display(String msg)
	{
		System.out.print("[" + msg);
		
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.print("]");
	}
}

class Second extends Thread{
	String msg;
	
	First obj;
	
	public Second(First ob,String ms)
	{
		obj = ob;
		msg = ms;
		
		start();
	}
	
	public void run()
	{
		synchronized(obj)
		{
			obj.display(msg);
		}
	}
}

class TestSyncro
{
	public static void main(String []args)
	{
		First first = new First();
	
		Second s1 = new Second(first,"Mahadev");
		Second s2 = new Second(first,"Mahakal");
	}
}