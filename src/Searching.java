import java.util.*;
public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int idx = -1;

        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + idx);
        }
    }
}
