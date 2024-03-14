import java.util.*;
public class EmailSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Email IDs: ");
        String emails[] = new String[5];
        for (int i = 0; i < 5; i++) {
            emails[i] = sc.nextLine();
        }
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            if (email.startsWith("raj")) {
                System.out.println("Email ID starts with raj: " + "\n" + email);
            }
        }
        sc.close();
    }
}