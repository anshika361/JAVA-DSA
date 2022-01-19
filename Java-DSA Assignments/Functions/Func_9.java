import java.util.Scanner;

public class Func_9 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        int factorial = 1;
        for (int i = 1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

}
