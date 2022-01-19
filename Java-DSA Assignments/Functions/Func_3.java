import java.util.Scanner;

public class Func_3 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        vote(age);
    }

    static void vote(int age){
        if (age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
