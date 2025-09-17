import java.util.*;
public class MissingNumber {
    public static int missingnum(int[] arr){
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;

        for(int ele : arr) {
            arraySum += ele;
        }
        return sum - arraySum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingnum(arr));
    }
}
