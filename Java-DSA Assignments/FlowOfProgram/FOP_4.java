import java.util.Scanner;

public class FOP_4 {
   public static void main(String args[]){

       int hcf=0;

       System.out.println("Enter the two integers:");
       Scanner input = new Scanner(System.in);
       int n1 = input.nextInt();
       int n2 = input.nextInt();
       for(int i = 1; i <= n1 || i <= n2; i++) {

           if( n1%i == 0 && n2%i == 0 )

               hcf = i;

       }

       System.out.println("HCF of given two numbers is "+hcf);

       int lcm = (n1*n2)/hcf;

       System.out.println("LCM of given two numbers is "+lcm);

   }

}
