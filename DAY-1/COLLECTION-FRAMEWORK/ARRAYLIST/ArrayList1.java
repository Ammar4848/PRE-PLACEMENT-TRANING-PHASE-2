import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add("A");
        al.add(9);
        al.add("S");
        al.add(null);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(2, "M");
        al.add("N");
        System.out.println(al);
        al.removeAll(al);
        System.out.println(al);
        al.add(3, "M");
        System.out.println(al);
    }
}