import java.awt.*;

class First extends Frame
{
	First()
	{
		runButton();
	}
	
	public void runButton()
	{
		Button b = new Button("Mahadev");
		Button b1 = new Button("Momai ma");
		
		b.setBounds(35,80,150,50);
		b1.setBounds(35,150,150,50);
				
		add(b);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
		add(b1);
		setLayout(null);
		setVisible(true);
	}
}

class TestFirst
{
	public static void main(String []args)
	{
		First obj = new First();
	}
}