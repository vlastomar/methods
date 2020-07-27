import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        vowelsCountAndPrint(word);

    }

    public static void vowelsCountAndPrint(String word1){
        int counter = 0;
        for (int i = 0; i < word1.length() ; i++) {
            if (word1.charAt(i) == 'o' || word1.charAt(i) == 'O'|| word1.charAt(i) == 'A'|| word1.charAt(i) == 'a' ||
                    word1.charAt(i) == 'E'|| word1.charAt(i) == 'I'|| word1.charAt(i) == 'i'||
                    word1.charAt(i) == 'U'|| word1.charAt(i) == 'u'|| word1.charAt(i) == 'e') {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
