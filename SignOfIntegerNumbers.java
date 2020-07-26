import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {

    signInteger();

    }
    public static void signInteger(){
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        }else {
            System.out.print("The number 0 is zero.");
        }
    }
}
