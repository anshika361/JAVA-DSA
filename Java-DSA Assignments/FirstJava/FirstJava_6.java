import java.util.Scanner;

public class FirstJava_6 {
    public static void main(String[] args) {
        System.out.print("Input Rupees to convert into USD: ");
        Scanner input = new Scanner(System.in);
        float Rupee = input.nextFloat();
        float usd = (float)(Rupee*0.014);
        System.out.println(Rupee + " Rupees are " + usd + " USD");
    }

}
