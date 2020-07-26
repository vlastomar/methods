import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstside = Integer.parseInt(scan.nextLine());
        int secondSide = Integer.parseInt(scan.nextLine());
        //claculationRectangleArea(firstside, secondSide);
        System.out.println(claculationRectangleArea(firstside, secondSide));

    }
    public static int claculationRectangleArea(int a, int b){
        int area = a * b;
        return area;
    }
}
