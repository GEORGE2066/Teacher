import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List integers = new ArrayList<>();

        int x = (int) (Math.random() * ((1000 - 100) + 1)) + 100;

        for (int i = 0; i < 21; i++) {
            integers.add((int)(Math.random() * ((1000 - 100) + 1)) + 100);
        }

        System.out.println(String.valueOf(integers));
    }
}