class EvenOddBySinchronizedThread implements Runnable
{
	static int count = 1;
	
	public void run()
	{
		while(count<=20)
		{
			if(count%2==0 && Thread.currentThread().getName().equals("even"))
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
		EvenOddBySinchronizedThread even = new EvenOddBySinchronizedThread();
		EvenOddBySinchronizedThread odd = new EvenOddBySinchronizedThread();
		
		Runnable r1 = even;
		Runnable r2 = odd;
		
		Thread t1 = new Thread(r1,"even");
		Thread t2 = new Thread(r2,"odd");
		
		t1.start();
		t2.start(); 
	}
}