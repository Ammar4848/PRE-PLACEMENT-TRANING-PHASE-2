import java.util.*;
public class UserExistInArray {
    public static void main(String[] args) {
        String users[] = {"John", "Doe", "Jane", "Smith", "Alex", "James", "Robert", "Michael", "William", "David"};
        String pass[] = {"123", "456", "789", "101", "112", "131", "415", "161", "718", "191"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(user) && pass[i].equals(password)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("User exists in the array");
        } else {
            System.out.println("User does not exist in the array");
        }
        sc.close();
    }
}