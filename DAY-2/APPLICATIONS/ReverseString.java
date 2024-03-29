import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string you want to reverse :");
        String str = sc.nextLine();
        String[] words = new String[str.length()];
        int j = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[j] = word;
                j++;
                word = "";
            } else {
                word = word + str.charAt(i);
            }
        }
        words[j] = word;
        System.out.println("Reversed String: ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != null) {
                System.out.print(words[i] + " ");
            }
        }
        sc.close();
    }   
}