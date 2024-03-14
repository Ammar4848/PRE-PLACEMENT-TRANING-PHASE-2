import java.util.*;
public class StudentResult {
    public static int[] selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static int binarySearch(int arr[], int x) {
        int index = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                index = mid;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 10 Students");
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        int result[] = { 70, 60, 90, 88, 155, 96, 72, 81 };
        int sortedResult[] = selectionSort(result);
        int sortedMarks[] = selectionSort(marks);
        int topper = sortedMarks[sortedMarks.length - 1];
        int index = binarySearch(sortedResult, topper);
        if (index != -1) {
            System.out.println("Marks found at index " + index);
        } else {
            System.out.println("Marks not found");
        }
        sc.close();
    }
}