import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        minHeap(arr, n);
        System.out.println("Min Heap:");
        printArray(arr, n);
    }

    static void minHeap(int arr[], int n) {
        int startIndex = (n / 2) - 1;
        for (int i = startIndex; i >= 0; i--)
            heapify(arr, n, i);
    }

    static void heapify(int arr[], int n, int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        if (smallest != index) {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, n, smallest);
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
