import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("A");
        t.add("M");
        t.add("M");
        t.add("A");
        t.add("R");
        t.add("N");
        t.add("A");
        t.add("G");
        t.add("A");
        t.add("R");
        t.add("J");
        t.add("I");
        //t.add(10); //java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        //t.add(null); //java.lang.NullPointerException
        System.out.println(t);
    }
}