import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char startChar = scan.nextLine().charAt(0);
        char endChar = scan.nextLine().charAt(0);
        printAllCharactersBetween(startChar, endChar);

    }

    public static void printAllCharactersBetween(char start, char end) {
        if (end > start) {
            for (int i = start + 1; i < end; i++) {
                char temp = (char) i;
                System.out.print(temp + " ");
            }
        } else {
            for (int i = end + 1; i < start; i++) {
                char temp = (char) i;
                System.out.print(temp + " ");
            }

        }
    }
}
