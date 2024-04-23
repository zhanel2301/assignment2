import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++)
            l.add(sc.nextInt());

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String text = sc.nextLine();
            if (text.equals("Insert" ) || text.equals("insert" ) || text.equals("INSERT" )) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x, y);
                sc.nextLine();
            } else if (text.equals("Delete") || text.equals("delete") || text.equals("DELETE")) {
                int x = sc.nextInt();
                l.remove(x);
                sc.nextLine();
            }
        }

        for (int num : l) {
            System.out.print(num + " ");
        }
    }
}
