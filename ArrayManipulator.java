import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        while (true){
            String[] command = scan.nextLine().split(" ");
            if ("end".equals(command[0])){
                /*for (int nu:numbers ) {
                    System.out.print(nu + ", ");
                }*/
                System.out.print("[");
                for (int i = 0; i < numbers.length - 1; i++) {
                    System.out.print(numbers[i] + ", ");
                }
                System.out.print(numbers[numbers.length - 1]);
                System.out.println("]");
                break;
            }
            switch (command[0]){
                case "exchange":
                    //exchangeArray(numbers, command);
                    numbers = exchangeArray(numbers, command);
                    break;
                case "max":
                    maxOddOrEven(numbers, command);
                    break;
                case "min":
                    minEvenOrOdd(numbers,command);
                    break;
                case "first":
                    firstEvenOrOdd(numbers, command);
                    break;
                case "last":
                    lastEvenOrOdd(numbers, command);
                    break;
            }
        }
    }
    public static int[] exchangeArray(int[] numb, String[] comm){
        int temp = Integer.parseInt(comm[1]);
        if (temp >= 0 && temp < numb.length) {
            int[] temp1 = new int[numb.length - temp - 1];
            int[] temp2 = new int[numb.length - temp1.length];
            int j = 0;
            for (int i = temp + 1; i < numb.length; i++) {
                temp1[j] = numb[i];
                j++;
            }
            for (int i = 0; i <= temp; i++) {
                temp2[i] = numb[i];
            }
            for (int i = 0; i < temp1.length; i++) {
                numb[i] = temp1[i];
            }
            j = 0;
            for (int i = temp1.length; i < numb.length; i++) {
                numb[temp1.length + j] = temp2[j];
                j++;
            }

        }else{
            System.out.println("Invalid index");
        }
        return numb;
    }
    public static void maxOddOrEven(int[] numb, String[] comm){
        int indexN = -1;
        if ("odd".equals(comm[1])){
            int maxNumber = Integer.MIN_VALUE;
            for (int i = 0; i <numb.length ; i++) {
                if (numb[i] % 2 != 0){
                    if (numb[i] > maxNumber){
                        maxNumber = numb[i];
                        indexN = i;
                    }else if (numb[i] == maxNumber){
                        indexN = i;
                    }
                }
            }
        }else if ("even".equals(comm[1])){
            int maxNumber = Integer.MIN_VALUE;
            for (int i = 0; i <numb.length ; i++) {
                if (numb[i] % 2 == 0){
                    if (numb[i] > maxNumber){
                        maxNumber = numb[i];
                        indexN = i;
                    }else if (numb[i] == maxNumber){
                        indexN = i;
                    }
                }
            }
        }
        if (indexN == -1){
            System.out.println("No matches");
        }else {
            System.out.println(indexN);
        }
    }
    public static void minEvenOrOdd(int[] numb, String[] comm){
        int indexN = -1;
        if ("odd".equals(comm[1])){
            int minNumber = Integer.MAX_VALUE;
            for (int i = 0; i <numb.length ; i++) {
                if (numb[i] % 2 != 0){
                    if (numb[i] < minNumber){
                        minNumber = numb[i];
                        indexN = i;
                    }else if (numb[i] == minNumber){
                        indexN = i;
                    }
                }
            }
        }else if ("even".equals(comm[1])){
            int minNumber = Integer.MAX_VALUE;
            for (int i = 0; i <numb.length ; i++) {
                if (numb[i] % 2 == 0){
                    if (numb[i] < minNumber){
                        minNumber = numb[i];
                        indexN = i;
                    }else if (numb[i] == minNumber){
                        indexN = i;
                    }
                }
            }
        }
        if (indexN == -1){
            System.out.println("No matches");
        }else {
            System.out.println(indexN);
        }
    }
    public static void  firstEvenOrOdd(int[] numb, String[] comm){
        int temp = Integer.parseInt(comm[1]);
        int[] temp1 = new int[temp];
        int j = -1;
        //int a = numb.length;
        if (temp <= numb.length && temp >= 0) {
            if ("odd".equals(comm[2])) {
                for (int i = 0; i < numb.length; i++) {
                    if (numb[i] % 2 != 0) {
                        j++;
                        temp1[j] = numb[i];
                        if (j == temp1.length - 1) {
                            break;
                        }
                    }
                }
            } else if ("even".equals(comm[2])) {
                for (int i = 0; i < numb.length; i++) {
                    if (numb[i] % 2 == 0) {
                        j++;
                        temp1[j] = numb[i];
                        if (j == temp1.length - 1) {
                            break;
                        }
                    }
                }
            }
            if (j == -1){
                System.out.println("[]");
            }else{
                System.out.print("[");
                for (int i = 0; i < j ; i++) {
                    System.out.print(temp1[i] + ", ");
                }
                System.out.print(temp1[j]);
                System.out.println("]");
            }
        }else{
            System.out.println("Invalid count");
        }
    }
    public static void lastEvenOrOdd(int[] numb, String[] comm){
        int temp = Integer.parseInt(comm[1]);
        int[] temp1 = new int[temp];
        int j = -1;
        //int a = numb.length;
        if (temp <= numb.length && temp >= 0) {
            if ("odd".equals(comm[2])) {
                for (int i = numb.length - 1; i >= 0; i--) {
                    if (numb[i] % 2 != 0) {
                        j++;
                        temp1[temp1.length - j - 1] = numb[i];
                        if (j == temp1.length - 1) {
                            break;
                        }
                    }
                }
            } else if ("even".equals(comm[2])) {
                for (int i = numb.length - 1; i >= 0; i--) {
                    if (numb[i] % 2 == 0) {
                        j++;
                        temp1[temp1.length - j - 1] = numb[i];
                        if (j == temp1.length - 1) {
                            break;
                        }
                    }
                }
            }
            if (j == -1){
                System.out.println("[]");
            }else{
                System.out.print("[");
                for (int i = 0 ; i < temp1.length - 1 ; i++) {
                    if (temp1[i] != 0){
                        System.out.print(temp1[i] + ", ");
                    }
                }
                System.out.print(temp1[temp1.length -1]);
                System.out.println("]");
            }
        }else{
            System.out.println("Invalid count");
        }
    }
}
