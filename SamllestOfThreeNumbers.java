import java.util.Scanner;

public class SamllestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        getSmallestNumber(firstNumber,secondNumber, thirdNumber);


    }
    public static void getSmallestNumber(int first, int second, int third){
        int tempNumber = Math.min(first,second);
        int smallestNumber = Math.min(tempNumber, third);
        System.out.println(smallestNumber);
    }
}
