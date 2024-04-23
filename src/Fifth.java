import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
    public static int unableToEatCount(ArrayList<Integer> students, ArrayList<Integer> samsa) {
        int unableToEat = 0;
        int j = 0;

        while (!students.isEmpty() && j < samsa.size()) {
            if (students.get(0).equals(samsa.get(j))) {
                students.remove(0);
                j++;
                unableToEat = 0;
            } else {
                students.add(students.remove(0));
                unableToEat++;
                if (unableToEat == students.size())
                    break;
            }
        }
        return unableToEat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("students: ");
        String studentsInput = sc.nextLine();
        String[] studentsArray = studentsInput.split(" ");
        ArrayList<Integer> students = new ArrayList<>();
        for (String str : studentsArray)
            students.add(Integer.parseInt(str));

        System.out.print("samsas: ");
        String samsasInput = sc.nextLine();
        String[] samsasArray = samsasInput.split(" ");
        ArrayList<Integer> samsas = new ArrayList<>();
        for (String str : samsasArray)
            samsas.add(Integer.parseInt(str));

        int unableToEat = unableToEatCount(students, samsas);
        System.out.println(unableToEat);
    }
}
