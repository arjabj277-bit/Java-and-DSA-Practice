import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
            long a = 0;
            boolean ok = true;

            for (int i = 0; i < 61; i++) {
                long x = (b >> i) & 1, y = (c >> i) & 1, z = (d >> i) & 1;

                if (z == 0) {
                    if (x == 1 && y == 0) ok = false;
                    if (x == 1 && y == 1) a |= 1L << i;
                } else {
                    if (x == 0 && y == 1) ok = false;
                    if (x == 0 && y == 0) a |= 1L << i;
                }
            }

            System.out.println(ok ? a : -1);
        }
    }
