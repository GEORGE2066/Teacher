import java.util.List;

public class Integers {
    private List integers;
    private int max;
    private int min;

    public Integers(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public String twenty(int min, int max) {
        for (int i = 0; i < 21; i++) {
            integers.add((int) (Math.random() * ((1000 - 100) + 1)) + 100);
        }
        return String.valueOf(integers);
    }
}
