import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("D");
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            String s = i.next();
            System.out.println(s);
        }
        System.out.println(h);
    }
}