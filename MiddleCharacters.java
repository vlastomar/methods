import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        if (input.length() % 2 == 0){
           evenMiddleChars(input);
        }else{
            oddMiddleChars(input);
        }
    }
    public static void evenMiddleChars(String str){
        int middle = str.length() / 2;
        String printMiddle = str.charAt(middle - 1) + "" + str.charAt(middle);
        System.out.println(printMiddle);
    }
    public static void oddMiddleChars(String str){
        int middle = str.length() / 2;
        System.out.println(str.charAt(middle));
    }
}
