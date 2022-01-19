import java.util.Scanner;

public class FirstJava_3 {
    public static void main(String[] args) {
        float P,T,R,SI;
        System.out.print("Enter principle value: ");
        Scanner input = new Scanner(System.in);

         P = input.nextFloat();
        System.out.print("Enter rate per Annum: ");
         R = input.nextFloat();
        System.out.print("Enter time in years: ");
         T = input.nextFloat();
         SI = (P*T*R/100);
        System.out.println("The simple interest for following P,T,R is: ");
        System.out.printf("%.2f",SI);
    }
}
