import java.util.Scanner;

class GetInputFromUser{
	public static void main(String arg[]){

		int roll;
		float per;
		String sname;
		char gender;
		long mo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name : - ");
		sname = sc.nextLine();
		
		System.out.println("Enter Your roll no : - ");
		roll = sc.nextInt();

		System.out.println("Enter Your per : - ");
		per = sc.nextFloat();

		System.out.println("Enter Your gender : - ");
		gender = sc.next().charAt(0);

		System.out.println("Enter Your mobile no : - ");
		mo = sc.nextLong();

		System.out.println("Data entered......");

		System.out.println("Name : " + sname);
		System.out.println("Roll : " + roll);
		System.out.println("Per : " + per);
		System.out.println("Gender(M or F) : " + gender);
		System.out.println("Mobile no : " + mo);
	}
}

