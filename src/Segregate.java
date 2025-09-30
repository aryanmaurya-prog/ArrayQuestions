import java.util.*;

public class Segregate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        segregate(arr);  // call the method

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to segregate 0s and 1s
    public static void segregate(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else {  // arr[i] == 1 && arr[j] == 0
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}
