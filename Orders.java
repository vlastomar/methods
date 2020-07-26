import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String order = scan.nextLine();
        int numbersOrder = Integer.parseInt(scan.nextLine());

        orderPricePrint(order, numbersOrder);
    }
    public static void orderPricePrint(String orderName, int numbersOfOrder){
        switch (orderName){
            case "coffee":
                System.out.printf("%.2f", numbersOfOrder * 1.50);
                break;
            case "water":
                System.out.printf("%.2f", numbersOfOrder * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f", numbersOfOrder * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f", numbersOfOrder * 2.00);
                break;
        }
    }
}
