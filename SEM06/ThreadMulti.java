class CookingTest extends Thread{

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
		Thread t1 = new CookingTest("past");
		Thread t2 = new CookingTest("maza");
		Thread t3 = new CookingTest("chevda");
		Thread t4 = new CookingTest("pista");
		
		t1.setName("chef-A");
		t1.start();
		t2.setName("chef-B");
		t2.start();
		t3.setName("chef-C");
		t3.start();
		t4.setName("chef-D");
		t4.start();
	}
}