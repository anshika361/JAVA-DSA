import java.util.Scanner;

public class Func_5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(product(a,b));
    }

    static int product(int a , int b){
        int product = a*b;
        return product;
    }
}
