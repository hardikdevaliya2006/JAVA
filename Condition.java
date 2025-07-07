import java.util.Scanner;

class Condition {
	public static void main(String arg[]){

		char i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ch : - ");
		i = sc.next().charAt(0);

		if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U'){
			System.out.println("ch is consonat!!");
		}else{
			System.out.println("ch vovel");
		}
	}
}