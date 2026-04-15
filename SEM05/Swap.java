import java.util.Scanner;

class Swap{
	public static void main(String arg[]){

		int a,b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1 : - ");
		a = sc.nextInt();
		
		System.out.println("Enter Number 2 : - ");
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b ;

		System.out.println("A : " + a + " B : " + b);
	}
}
