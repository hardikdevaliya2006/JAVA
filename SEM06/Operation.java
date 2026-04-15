class Operation
{
	public static void main(String args[])	
	{
		Addition A=new Addition();
		int sum=A.add(4,5);
		System.out.println("The Sum is: "+sum);

		Subtraction S=new Subtraction();
		int sub=S.sub(6,3);
		System.out.println("The Subtraction is : "+sub);

		Multiplication M=new Multiplication();
		int mul=M.mul(7,8);
		System.out.println("The Multiplication is : "+mul);

		Division D=new Division();
		int div=D.div(24,8);
		System.out.println("The Division is : "+div);

		Module m=new Module();
		int module=m.mod(8,3);
		System.out.println("The Module is : "+module);
	}
}
class Addition
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
class Subtraction
{
	public int sub(int a,int b)
	{
		return a-b;
	}
}	
class Multiplication
{
	public int mul(int a,int b)
	{
		return a*b;
	}
}
class Division
{
	public int div(int a,int b)
	{
		return a/b;
	}
}
class Module
{
	public int mod(int a,int b)
	{
		return a%b;
	}
}
	