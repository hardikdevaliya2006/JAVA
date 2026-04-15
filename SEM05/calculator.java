import java.util.Scanner;

class calculator{
	public static void main(String args[]){
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entyer First number : ");
		n1=sc.nextDouble();
		System.out.println("Enter Second number : ");
		n2=sc.nextDouble();
		System.out.println("Enter Your choice : (+,-,*,/,%) ");
		ch=sc.next().charAt(0);

		switch(ch) {
			case '+':res=n1+n2;
				break;
			case '-':res=n1-n2;
				break;
			case '*':res=n1*n2;
				break;
			case '/':res=n1/n2;
				break;
			case '%':res=n1%n2;
				break;
			default : System.out.println("Error!.. enter proper operator");
			return;
		}

		System.out.println("First Number : " + n1);
		System.out.println("Second Number : " + n2);
		System.out.println("Operator : " + ch);
		System.out.printf("%.1f %c %.1f = %.1f",n1,ch,n2,res);
	}
}