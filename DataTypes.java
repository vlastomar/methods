import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeVar = scan.nextLine();

        switch (typeVar){
            case "int":
                int numberI = Integer.parseInt(scan.nextLine());
                processVar(numberI);
                break;
            case "real":
                double numberD = Double.parseDouble(scan.nextLine());
                processVar(numberD);
                break;
            case "string":
                String processStr = scan.nextLine();
                processVar(processStr);
                break;
        }

    }
    public static void  processVar(int numb){
        int temp = numb * 2;
        System.out.println(temp);
    }
    public static void  processVar(double numb){
        double temp = numb * 1.5;
        System.out.printf("%.2f", temp);
    }
    public static void  processVar(String str){
        String  temp = "$" + str + "$";
        System.out.println(temp);
    }

}
