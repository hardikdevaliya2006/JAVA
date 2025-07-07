import java.util.Scanner;
class AsciValue{
	public static void main(String args[]){
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ch : - ");
		ch = sc.next().charAt(0);
			
		int asic = ch;
		System.out.println(asic);
	}
}