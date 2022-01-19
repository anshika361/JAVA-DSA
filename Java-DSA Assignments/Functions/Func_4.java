import java.util.Scanner;

public class Func_4 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a,b));
    }

    static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
}
