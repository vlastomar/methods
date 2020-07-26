import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(returnPower(number, power)));

    }

    public static double returnPower(double numb, int pow){
        double result = Math.pow(numb, pow);
        return result;
    }
}
