import java.util.*;
public class RotateArray{
    static void rotatearray(int[] arr,int d) {
        int n = arr.length;
        d %= n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[] arr,int i,int j) {
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        rotatearray(arr,n-d);

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}


















