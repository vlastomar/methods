import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.##").format(mathOperat(firstNumber,operator,secondNumber)));
    }
    public static double mathOperat(int numb1, String oper, int numb2){
        double result = 0.0;
        switch (oper){
            case "/":
                result = numb1 / numb2 * 1.00;
                break;
            case "*":
                result = numb1 * numb2;
                break;
            case "+" :
                result = numb1 + numb2;
                break;
            case "-":
                result = numb1 - numb2;
                break;
        }
        return  result;
    }
}
