import java.util.Scanner;

public class FirstJava_4 {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        System.out.print("Enter first number: ");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.print("Enter second number: ");
       float num2 = input.nextFloat();
        System.out.println("Select the operator:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
        System.out.print("Enter choice: ");
        int n = input.nextInt();
        if (n == 1) {
            System.out.println("the result is: " +  (num1 + num2));
        } else if (n == 2) {
            System.out.println("The result is: " + (num1 - num2));
        } else if (n == 3) {
            System.out.println("The result is: " + (num1 * num2));
        } else if (n == 4) {
            System.out.println("The result is: " + (num1 / num2));
        } else {
            System.out.println("invalid choice");
        }
    }
}
