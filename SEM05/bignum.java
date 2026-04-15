import java.util.Scanner;

class bignum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int big;

        if (num1 >= num2 && num1 >= num3) {
            big = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            big = num2;
        } else {
            big = num3;
        }

        System.out.println("The biggest number is: " + big);
    }
}
