class Confirmation
{
	public void ConfirmMessage(String msg)
	{
		System.out.println(msg + " Booking Successfully");
		
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class TickitBooking extends Thread
{
	String msg;
	
	Confirmation obj;
	
	TickitBooking(Confirmation obj,String msg)
	{
		this.obj = obj;
		this.msg = msg;
	}
	
	public void run()
	{
		synchronized(obj)
		{
			obj.ConfirmMessage(msg);
		}
	}
}

class TestingBooking
{
	public static void main(String []args) throws InterruptedException
	{
		Confirmation obj = new Confirmation();
		
		TickitBooking tickit1 = new TickitBooking(obj,"Tickit-1");
		TickitBooking tickit2 = new TickitBooking(obj,"Tickit-2");
		TickitBooking tickit3 = new TickitBooking(obj,"Tickit-3");
		
		tickit1.start();
		tickit1.join();
		
		tickit2.start();
		tickit2.join();
		
		tickit3.start();
		tickit3.join();
	}
}