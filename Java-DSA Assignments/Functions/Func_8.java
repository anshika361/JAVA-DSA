import java.util.Scanner;

public class Func_8 {
    public static void main(String[] args) {
        System.out.println("Enter your marks out of 100: ");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        System.out.println(Grades(marks));
    }


    static String Grades(int marks){
        if (marks >=91 && marks <=100){
            return "AA";
        }
        else if (marks >=81 && marks <= 90){
            return "AB";
        }
        else if (marks >=71 && marks <= 80){
            return "BB";
        }
        else if (marks >=61 && marks <= 70){
            return "BC";
        }
        else if (marks >=51 && marks <= 60){
            return "CD";
        }
        else if (marks >=41 && marks <= 50){
            return "DD";
        }
        else{
            return "Fail";
        }
    }
}
