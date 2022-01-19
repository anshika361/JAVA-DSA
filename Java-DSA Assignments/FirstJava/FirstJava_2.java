import java.util.Scanner;

public class FirstJava_2 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hey "+name+" wishing you all the best!");
    }
}
