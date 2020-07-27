import java.util.Scanner;

public class TribunachiSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        printTribonacciSequence(number);

    }
    public static void printTribonacciSequence(int numb){
        if (numb > 3) {
            int first = 2;
            int second = 1;
            int third = 1;
            System.out.print(third + " " + second + " " + first + " ");
            for (int i = 3; i < numb; i++) {
                int temp = first + second + third;
                System.out.print(temp + " ");
                third = second;
                second = first;
                first = temp;
            }
        }else if (numb == 1){
            System.out.println("1");
        }else if (numb == 2){
            System.out.print("1" + " " + "1");
        }else if (numb == 3){
            System.out.println("1" + " " + "1" + " "+ "2");
        }
    }
}
