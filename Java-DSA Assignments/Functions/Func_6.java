import java.util.Scanner;

public class Func_6 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        area(r);
        circumference(r);
    }

    static void area(int r){
        double area =  (3.14*r*r);
        System.out.println("The area of the circle is: " + area);

    }

    static void circumference(int r){
        double circumference =  (2*3.14*r);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
