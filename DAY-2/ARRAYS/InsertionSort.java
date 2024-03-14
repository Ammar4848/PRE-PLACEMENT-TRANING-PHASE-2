import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Current array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int loc = i-1;
            while (loc >= 0 && arr[loc] < temp) {
                arr[loc+1] = arr[loc];
                loc = loc-1;
            }
            arr[loc+1] = temp;
        }
        System.out.println("\nThe array after sorting is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}