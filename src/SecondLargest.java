import java.util.*;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int largestElement = Integer.MIN_VALUE;
        int secondlargestElement = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }

        System.out.println("Largest Element: " + largestElement);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > secondlargestElement && arr[i] < largestElement){
                secondlargestElement = arr[i];
            }
        }
        System.out.println("Second Largest Element: " + secondlargestElement);
    }
}