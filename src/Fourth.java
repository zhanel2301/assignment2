import java.util.ArrayList;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the numbers (enter a non-digit to stop): ");
        while (sc.hasNextInt())
            list.add(sc.nextInt());

        reversedList(list);

        System.out.print("Reversed list: ");
        for (int num : list)
            System.out.print(num + " ");
    }

    public static void reversedList(ArrayList<Integer> list) {
        if (list.size() > 0) {
            int temp = list.remove(list.size() - 1);

            reversedList(list);

            list.add(0, temp);
        }
    }
}
