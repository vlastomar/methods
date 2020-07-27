import java.util.Scanner;

public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        sumTwoIntegers(firstNumber, secondNumber, thirdNumber);

    }
    public static void sumTwoIntegers(int first, int second, int third){
        int forthNumber = first + second;
        substractTwoIntehers(forthNumber, third);
    }
    public static void substractTwoIntehers(int first, int second){
        System.out.println(first - second);
    }
}
