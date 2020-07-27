import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        boolean checkPassword = true;
         checkPassword = checkForLength(password, checkPassword);
         boolean check2 = checkForLettersAndDigits(password,checkPassword);
         boolean check3 = checkMin2Digits(password,checkPassword);
        if (checkPassword && check2 && check3){
            System.out.println("Password is valid");
        }


    }
    public static boolean checkForLength(String pass, boolean check){
        if (pass.length() > 10 || pass.length() < 6){
            System.out.println("Password must be between 6 and 10 characters");
            check = false;
        } else{
            check = true;
        }
        return  check;
    }
    public static boolean checkForLettersAndDigits(String pass, boolean check){
        check = true;
        for (int i = 0; i < pass.length() ; i++) {
            if ((pass.charAt(i) >= 48 && pass.charAt(i) <= 57) || (pass.charAt(i) >= 65 && pass.charAt(i) <= 90) ||
                    (pass.charAt(i) >= 97 && pass.charAt(i) <= 122)){
            }else{
                System.out.println("Password must consist only of letters and digits");
                check = false;
                break;
            }

        }
        return check;
    }
    public static boolean checkMin2Digits(String pass, boolean check){
        int counter = 0;
        for (int i = 0; i < pass.length() ; i++) {
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57){
                counter += 1;
            }
        }
        if (counter < 2){
            System.out.println("Password must have at least 2 digits");
            check = false;
        }else{
            check = true;
        }
        return check;
    }



}
