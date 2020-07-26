import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeVariable = scan.nextLine();
        switch (typeVariable){
            case "int":
                int number1 = Integer.parseInt(scan.nextLine());
                int number2 = Integer.parseInt(scan.nextLine());
                System.out.println(returnMax(number1,number2));
                break;
            case "char" :
                char ch1 = scan.nextLine().charAt(0);
                char ch2 = scan.nextLine().charAt(0);
                System.out.println(returnMax(ch1,ch2));
                break;
            case "string":
                String str1 = scan.nextLine();
                String str2 = scan.nextLine();
                System.out.println(returnMax(str1, str2));
                break;
        }

    }
    public static String returnMax(String str1, String str2){
        String result = "";
        if (str1.compareTo(str2) >= 0){
            result = str1;
        }else{
            result = str2;
        }
        return  result;
    }
    public static int returnMax(int numb1, int numb2){
        int result = 0;
        result = Math.max(numb1, numb2);
        return result;
    }
    public static char returnMax(char cha1, char cha2){
        char result = 'a';
        if (cha1 > cha2){
            result = cha1;
        }else{
            result = cha2;
        }
        return result;
    }
}
