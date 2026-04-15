class Alphabet extends Thread{
	public void run()
	{
		for(char ch='A';ch<'Z';ch++)
		{
			System.out.println("Alphabet : " + ch);
		}
	}
}

class Numeric extends Thread{
	public void run()
	{
		for(int i=0;i<9;i++)
		{
			System.out.println("Number : " + i);
		}
	}
}

class AlphaNumeric{
	public static void main(String []args)
	{
		Alphabet a = new Alphabet();
		Numeric n = new Numeric();
		
		a.start();
		n.start();
	}
}