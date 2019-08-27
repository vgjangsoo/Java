import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

        String c = "1";
        int d = Integer.parseInt(c) + 2;
        System.out.println(d);

        String e = "1.1";
        double f = Double.parseDouble(e) + 2;
        System.out.println(f);
    }
}