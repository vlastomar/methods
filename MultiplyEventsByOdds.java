import java.util.Scanner;

public class MultiplyEventsByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputNumber = scan.nextLine();
        System.out.println(getMultiplyEventOdd(inputNumber));
    }
    public static int getMultiplyEventOdd(String inpNumb){
        int numbOdd = 0;
        int numbEven = 0;
        if (inpNumb.charAt(0) == '-') {
            for (int i = 0; i < inpNumb.length()-1; i++) {
                int tempNumb = Integer.parseInt(String.valueOf(inpNumb.charAt(i + 1)));
                if (tempNumb % 2 == 0) {
                    numbEven += tempNumb;
                } else {
                    numbOdd += tempNumb;
                }
            }
        }else {
                for (int i = 0; i < inpNumb.length(); i++) {
                    int tempNumb = Integer.parseInt(String.valueOf(inpNumb.charAt(i)));
                    if (tempNumb % 2 == 0) {
                        numbEven += tempNumb;
                    } else {
                        numbOdd += tempNumb;
                    }
                }
            }
        int result = numbEven * numbOdd;
        return  result;
    }
}
