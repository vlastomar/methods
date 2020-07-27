import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        number = Math.abs(number);
        calcuateTopNumber(number);


    }
    public static void calcuateTopNumber(int numb){
        //String numbS = numb + "";

        for (int i = 10; i <=numb ; i++) {
            int number8 = 0;
            boolean checkOddNumb = false;
            String iString = i + "";
            for (int j = 0; j <iString.length() ; j++) {
                int number = Integer.parseInt(String.valueOf(iString.charAt(j)));
                number8 += number;
                if (number % 2 != 0){
                    checkOddNumb = true;
                }
            }
            if (number8 % 8 == 0 && checkOddNumb){
                System.out.println(i);
            }
        }


    }
}


