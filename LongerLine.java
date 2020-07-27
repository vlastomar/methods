import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dist1 = 0;
        int dist2 = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int x11 = 0;
        int y11 = 0;
        int x22 = 0;
        int y22 = 0;

        for (int i = 0; i < 2 ; i++) {
            x1 = Integer.parseInt(scan.nextLine());
            y1 = Integer.parseInt(scan.nextLine());
            x2 = Integer.parseInt(scan.nextLine());
            y2 = Integer.parseInt(scan.nextLine());

            dist2 = distanceBetweenPoints(x1, y1, x2, y2);

            if (i == 1){
                break;
            }
            dist1 = dist2;
            x11 = x1;
            y11 = y1;
            x22 = x2;
            y22 = y2;

        }


        /*int dist1 = 0;
        int dist2 = 0;
        int x = 0;
        int y = 0;
        int xClosest = 0;
        int yClosest = 0;*/
        if (dist1 < dist2){
            x11 = x1;
            y11 = y1;
            x22 = x2;
            y22 = y2;
        }

        for (int i = 0; i < 2 ; i++) {

           dist2 = distanceToCenter(x11, y11);

            if (i == 1){
                dist2 = distanceToCenter(x22, y22);
                break;
            }
            dist1 = dist2;
        }
        if (dist1 <= dist2){
            System.out.print("(" + x11 + "," + " " + y11 + ")");
            System.out.print("(" + x22 + "," + " " + y22 + ")");
        }else if (dist1 > dist2){
            System.out.print("(" + x22 + "," + " " + y22 + ")");
            System.out.print("(" + x11 + "," + " " + y11 + ")");
        }


    }
    public static int distanceToCenter(int xInput, int yInput){
        int dist = xInput * xInput + yInput * yInput;
        return dist;
    }
    public static int distanceBetweenPoints(int x1, int y1, int x2, int y2){
        int dist = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 -y1);
        return dist;
    }
}
