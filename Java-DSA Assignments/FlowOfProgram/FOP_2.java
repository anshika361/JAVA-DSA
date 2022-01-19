import java.util.Scanner;

public class FOP_2 {
    public static void main(String[] args) {
        System.out.print("Enter 1st number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum of two numbers " + a + " and " + b + " is equal to " + sum);
    }
}
