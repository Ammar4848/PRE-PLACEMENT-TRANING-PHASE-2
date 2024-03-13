import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(4);
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Color List: ");
        for(int i = 0; i < colors.size();i++){
            System.out.println(colors.get(i).toString());
        }
        System.out.println("Initial Size of ArrayList : "+colors.size());
        ArrayList<String> sample = new ArrayList<>(3);
        sample.add("Black");
        sample.add("White");
        sample.add("Grey");
        colors.addAll(sample);
        System.out.println("New Size of ArrayList : "+colors.size());
        System.out.println("Color List: ");
        for(int i = 0; i < colors.size();i++){
            System.out.println(colors.get(i).toString());
        }
    }
}