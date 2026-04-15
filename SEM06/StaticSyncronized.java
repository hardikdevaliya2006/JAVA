class Table 
{
	syncronized static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
		try{
			
		}catch(InterruptedException e)
		{
			
		}
	}
}

class Task1 extends Thread
{
	public void run()
	{
		Table.printTable(5);
	}
}

class Task2 extends Thread{
	public void run()
	{
		Table.printTable(8);
	}
}

class TestTable
{
	Task1 t1 = new Task1();
	Task2 t2 = new Task2();
	
	t1.start();
	t2.start();
}