import java.util.Scanner;

public class waytoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            String s1 = sc.next();
            int a = s1.length();

            if(a > 10) {
                System.out.println("" + s1.charAt(0) + (a - 2) + s1.charAt(a - 1));
            } 
            else {
                System.out.println(s1);
            }
        }

        sc.close();
    }
}