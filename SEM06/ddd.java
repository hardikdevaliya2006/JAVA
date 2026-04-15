class ddd implements Runnable
{
	static int count = 1;
	
	public void run()
	{
		while(count<=20)
		{
			if(count%2==0 && Thread.currentThread().equals("even"))
			{
				synchronized(this)
				{
					System.out.println("Thread Name : " + Thread.currentThread().getName() + " Value : " + count);
					count++;
					
					try
					{
						this.wait(100);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			
			if(count%2!=0 && Thread.currentThread().getName().equals("odd"))
			{
				synchronized(this)
				{
					System.out.println("Thread Name : " + Thread.currentThread().getName() + " Value : " + count);
					count++;
					
					this.notifyAll();	
				}
			}
		}
	}
	
	public static void main(String []args)
	{
		ddd d1= new ddd();
		ddd d2 = new ddd();
		
		Runnable r1 = d1;
		Runnable r2 = d2;
		
		Thread t1 = new Thread(r1,"even");
		Thread t2 = new Thread(r2,"odd");
		
		t1.start();
		t2.start(); 
	}

  
    
}