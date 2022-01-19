import java.util.Scanner;

public class Func_2 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        evenodd(n);
    }

    static void evenodd(int n){
        if (n%2 == 0){
            System.out.println("The given number " + n + " is even");
        }
        else{
            System.out.println("The given number " + n + " is odd");
        }
    }
}
