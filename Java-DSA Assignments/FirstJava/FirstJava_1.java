import java.util.Scanner;

public class FirstJava_1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n%2 == 0){
            System.out.println(n + " is an even number");
        }
        else{
            System.out.println(n + " is an odd number");
        }
    }
}
