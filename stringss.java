import java.util.Scanner;

public class stringss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

       
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

    
        if (s1.compareTo(s2) < 0) {
            System.out.print("-1");
        } 
        else if (s1.compareTo(s2) > 0) {
            System.out.print("1");
        } 
        else {
            System.out.print("0");
        }
    }
}
    

