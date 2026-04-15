import java.util.Scanner;

class basicOprations{
	public static void main(String arg[]){

		int no1, no2, ans;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1 : - ");
		no1= sc.nextInt();
		
		System.out.println("Enter Number 2 : - ");
		no2 = sc.nextInt();

		System.out.println("Data entered......");

		ans = no1+no2;
		System.out.println("Addition : " + ans);

		ans = no1-no2;
		System.out.println("Subtraction : " + ans);

		ans = no1*no2;
		System.out.println("Multipication : " + ans);

		ans = no1/no2;
		System.out.println("Division : " + ans);

		ans = no1%no2;
		System.out.println("Modulo : " + ans);
	}
}

