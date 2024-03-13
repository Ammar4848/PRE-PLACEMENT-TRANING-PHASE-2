import java.util.*;

public class ShopingCart {
    public static void main(String[] args) {
        ArrayList<Integer> itemNo = new ArrayList<>();
        ArrayList<String> itemName = new ArrayList<>();
        ArrayList<Integer> Price = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Items");
            System.out.println("2. Show Items");
            System.out.println("3. Delete Items");
            System.out.println("4. Update Items");
            System.out.println("5. Order Menu");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Item No: ");
                    int no = sc.nextInt();
                    itemNo.add(no);
                    System.out.println("Enter Item Name: ");
                    String name = sc.next();
                    itemName.add(name);
                    System.out.println("Enter Item Price: ");
                    int price = sc.nextInt();
                    Price.add(price);
                    break;
                case 2:
                    System.out.println("Item No\tItem Name\tItem Price");
                    for (int i = 0; i < itemNo.size(); i++) {
                        System.out.println(itemNo.get(i) + "\t" + itemName.get(i) + "\t" + Price.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter Item No to delete: ");
                    int del = sc.nextInt();
                    for (int i = 0; i < itemNo.size(); i++) {
                        if (itemNo.get(i) == del) {
                            itemNo.remove(i);
                            itemName.remove(i);
                            Price.remove(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Item No to update: ");
                    int up = sc.nextInt();
                    for (int i = 0; i < itemNo.size(); i++) {
                        if (itemNo.get(i) == up) {
                            System.out.println("Enter Item No: ");
                            int no1 = sc.nextInt();
                            itemNo.set(i, no1);
                            System.out.println("Enter Item Name: ");
                            String name1 = sc.next();
                            itemName.set(i, name1);
                            System.out.println("Enter Item Price: ");
                            int price1 = sc.nextInt();
                            Price.set(i, price1);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Item No\tItem Name\tItem Price");
                    for (int i = 0; i < itemNo.size(); i++) {
                        System.out.println(i + "\t" + itemName.get(i) + "\t" + Price.get(i));
                    }
                    while (true) {
                        System.out.println("Enter Choice you want to buy: ");
                        int ch = sc.nextInt();
                        System.out.println("Enter Quantity: ");
                        int qty = sc.nextInt();
                        System.out.println("Total Price: " + Price.get(ch) * qty);
                        break;
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}