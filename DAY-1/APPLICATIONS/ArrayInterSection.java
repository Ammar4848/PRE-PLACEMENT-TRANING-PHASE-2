public class ArrayInterSection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 8};
        int[] arr2 = {8, 3, 4, 5, 6, 7};
        int[] arr3 = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }
    }   
}