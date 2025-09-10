import java.sql.SQLOutput;
import java.util.*;
public class IndexedQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            if(i%2 == 1) {
                arr[i] *= 2;
                System.out.println(arr[i] + " ");
            } else {
                arr[i] += 10;
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
