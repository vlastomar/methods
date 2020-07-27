import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int number3 = Integer.parseInt(scan.nextLine());

        checkResultsOfMultiplying(number1, number2, number3);

    }
    public static void checkResultsOfMultiplying(int numb1, int numb2, int numb3){
        if (numb1 == 0 || numb2 == 0 || numb3 == 0){
            System.out.println("zero");
        }if(numb1 < 0){
            if ((numb2 < 0 && numb3 > 0) || (numb2 > 0 && numb3 < 0)){
                System.out.println("positive");
            }if (numb2 > 0 && numb3 > 0){
                System.out.println("negative");
            }
        }if(numb2 < 0) {
            if (numb1 > 0 && numb3 < 0){
                System.out.println("positive");
            }
            if (numb1 > 0 && numb3 > 0) {
                System.out.println("negative");
            }
        }if(numb3 < 0) {
            if (numb1 > 0 && numb2 > 0) {
                System.out.println("negative");
            }
        }if (numb1 > 0 && numb2 > 0 && numb3 > 0){
            System.out.println("positive");
        }
    }
}
