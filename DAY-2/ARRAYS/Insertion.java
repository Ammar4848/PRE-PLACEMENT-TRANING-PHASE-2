import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be inserted: ");
        int x = sc.nextInt();
        System.out.println("Enter the position at which the element is to be inserted: ");
        int pos = sc.nextInt();
        for (int i = n-1; i >= pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = x;
        System.out.println("The array after insertion is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the Position of the element to be deleted: ");
        int del = sc.nextInt();
        for (int i = del-1; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("The array after deletion is: ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}