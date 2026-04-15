class Odd extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2 != 0)
			{
				System.out.println("Odd : " + i);				
			}
		}
	}
}

class Even extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even : " + i);
			}
		}
	}
}


class EvenOdd{
	public static void main(String []args)
	{
		Odd o = new Odd();
		Even e = new Even();
		
		o.start();
		e.start();
	}
}