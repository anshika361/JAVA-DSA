import java.util.Scanner;

public class FOP_3 {
    public static void main(String[] args) {
        System.out.print("Enter the number for its multiplication table: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("Enter the range: ");
        int range = input.nextInt();
        System.out.println("The multiplication table for " + num + " is:");
        
        for (int i = 1; i<=range ; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
