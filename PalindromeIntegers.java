import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            String inputNumber = scan.nextLine();
            if ("END".equals(inputNumber)){
                break;
            }
            System.out.println(checkForReverseSameNumber(inputNumber));;
        }

    }
    public static boolean checkForReverseSameNumber(String input){
        boolean check = true;
        for (int i = 0; i < input.length()/2; i++) {
            //char a = input.charAt(i);
            //char b = input.charAt(input.length() -1 -i);
            if (input.charAt(i) != input.charAt(input.length() -1 -i)){
                check = false;
                break;
            }
        }

        return check;
    }
}
