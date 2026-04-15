import java.awt.*;

class Second
{
	Second()
	{
		setBtn();
	}
	
	public void setBtn()
	{
		Frame f1 = new Frame();
		
		Button btn1 = new Button("Mahadev");
		
		btn1.setBounds(20,50,100,50);
		
		f1.setSize(500,500);
		
		f1.add(btn1);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}

class TestSecond{
	public static void main(String []args)
	{
		Second s1 = new Second();
	}
}