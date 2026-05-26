//Given a route containing 4 directions (E, W, N, S) find the shortest path to reach destination

import java.util.Scanner;

public class Example3 {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 's') {
                y--;
            } else if (dir == 'n') {
                y++;
            } else if (dir == 'w') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your path: ");
        String path = sc.next();
        System.out.println(getShortestPath(path));
    }
}
