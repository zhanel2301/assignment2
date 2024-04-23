import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < num; j++)
                line.add(sc.nextInt());
            lines.add(line);
        }

        int queries = sc.nextInt();
        int[][] positions = new int[queries][2];

        for (int i = 0; i < queries; i++) {
            positions[i][0] = sc.nextInt();
            positions[i][1] = sc.nextInt();
        }

        for (int i = 0; i < queries; i++) {
            int x = positions[i][0];
            int y = positions[i][1];

            if (x <= lines.size() && x >= 1 && y <= lines.get(x - 1).size() && y >= 1)
                System.out.println(lines.get(x - 1).get(y - 1));
            else
                System.out.println("ERROR!");
        }
    }
}
