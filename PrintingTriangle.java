import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number ; i++) {
            printTriangle(1, i);
            System.out.println();
        }
        for (int i = number - 1; i > 0 ; i--) {
            printTriangle(1,i);
            System.out.println();
        }
    }
    public static void printTriangle(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
    }
}
