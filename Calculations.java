import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String action = scan.nextLine();
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        switch (action){
            case "add" :
                addNumbers(firstNumber, secondNumber);
                break;
            case "multiply" :
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractNumbers(firstNumber,secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber, secondNumber);
                break;
        }


    }
    public static void addNumbers(int firstN, int secondN){
        System.out.println(firstN + secondN);
    }
    public static void multiplyNumbers(int firstN, int secondN){
        System.out.println(firstN  * secondN);
    }
    public static void subtractNumbers(int firstN, int secondN){
        System.out.println(firstN - secondN);
    }
    public static void divideNumbers(int firstN, int secondN){
        System.out.println(firstN / secondN);
    }
}
