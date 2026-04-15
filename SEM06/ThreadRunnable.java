class CookingTest implements Runnable{

  	private String task;
  	
  	public CookingTest(String task)
  	{
  		this.task = task;
  	}
  	
  	public void run()
  	{
  		System.out.println(task + " Is A " + Thread.currentThread().getName());
  	}
}

class Restorant{
	public static void main(String []args)
	{
		Thread t1 = new Thread(new CookingTest("past"));
		Thread t2 = new Thread(new CookingTest("maza"));
		Thread t3 = new Thread(new CookingTest("chevda"));
		Thread t4 = new Thread(new CookingTest("pista"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}