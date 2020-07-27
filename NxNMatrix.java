import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        printNxNMatrix(number);

    }
    public static void printNxNMatrix(int numb){
        for (int i = 1; i <= numb ; i++) {
            for (int j = 1; j <= numb ; j++) {
                System.out.print(numb + " ");
            }
            System.out.println();
        }
    }
}
