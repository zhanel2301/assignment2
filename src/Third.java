import java.util.ArrayList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> shelf = new ArrayList<>();
        ArrayList<Integer> removedDisks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();

            if (operation == 1) {
                int diskNum = sc.nextInt();
                shelf.add(0, diskNum);
            } else if (operation == 2) {
                int diskNum = sc.nextInt();
                shelf.add(diskNum);
            } else if (operation == 3) {
                int removedDisk = shelf.remove(0);
                removedDisks.add(removedDisk);
            } else if (operation == 4) {
                int removedDisk = shelf.remove(shelf.size() - 1);
                removedDisks.add(removedDisk);
            }
        }

        for (int disk : removedDisks) {
            System.out.print(disk + " ");
        }
    }
}
