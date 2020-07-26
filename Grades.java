import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        grades();
    }
    public static void grades(){
        Scanner scan = new Scanner(System.in);
        double evaluation = Double.parseDouble(scan.nextLine());
        printGrades(evaluation);

    }
    public static void printGrades(double evaluation){
        if (evaluation < 3.00){
            System.out.println("Fail");
        }else   if (evaluation >= 3.00 && evaluation < 3.50){
            System.out.println("Poor");
        }else   if (evaluation >= 3.50 && evaluation < 4.50){
            System.out.println("Good");
        }else   if (evaluation >= 4.50 && evaluation < 5.50){
            System.out.println("Very good");
        }else   if (evaluation >= 5.50 && evaluation <= 6.00){
            System.out.println("Excellent");
        }
    }
}