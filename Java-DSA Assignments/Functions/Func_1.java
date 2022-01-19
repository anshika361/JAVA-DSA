
import java.util.Scanner;

public class Func_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The maximum of three numbers is: ");
        System.out.println(max(a,b,c));
        System.out.println("The minimum of three numbers is: ");
        System.out.println(min(a,b,c));
    }

    static int max(int a, int b, int c){
        int max;
        if (a>b && a>c){
            max = a;
        }
        else if(b>c){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c){
        int min;
        if(a<b && a<c){
            min = a;
        }
        else if(b<c){
            min = b;
        }
        else{
            min = c;
        }
        return min;
    }
}
