import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String initilStr = scan.nextLine();
        int numberRepeat = Integer.parseInt(scan.nextLine());
        System.out.println(returnNewStr(initilStr,numberRepeat));

    }
    public static String returnNewStr (String initial, int number){
        String result   = "";
        for (int i = 0; i < number ; i++) {
            result += initial;

        }
        return result;
    }
}
