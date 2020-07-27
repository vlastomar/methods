import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dist1 = 0;
        int dist2 = 0;
        int x = 0;
        int y = 0;
        int xClosest = 0;
        int yClosest = 0;

        for (int i = 0; i < 2 ; i++) {
            x = Integer.parseInt(scan.nextLine());
            y = Integer.parseInt(scan.nextLine());
            dist2 = distanceToCenter(x, y);

            if (i == 1){
                break;
            }
            dist1 = dist2;
            xClosest = x;
            yClosest = y;

        }
         if (dist1 < dist2){
             System.out.print("(" + xClosest + "," + " " + yClosest + ")");
         }else if (dist1 > dist2){
             System.out.print("(" + x + "," + " " + y + ")");
         }else{
             System.out.print("(" + x + "," + " " + y + ")");
         }


    }
    public static int distanceToCenter(int xInput, int yInput){
        int dist = xInput * xInput + yInput * yInput;
        return dist;
    }
}
