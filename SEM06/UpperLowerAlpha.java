class UpperCase extends Thread{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println("UpperCase : " + ch);
		}
	}
}

class LowerCase extends Thread{
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println("LowerCase : " + ch);
		}
	}
}

class AlphaTest{
	public static void main(String []args)
	{
		UpperCase uc = new UpperCase();
		LowerCase lc = new LowerCase();
		
		uc.setPriority(Thread.MAX_PRIORITY);
		
		uc.start();
		
		System.out.println(uc.getPriority());
		
		lc.setPriority(Thread.MIN_PRIORITY);
		
		lc.start();
		
		System.out.println(uc.getPriority());
	}
}