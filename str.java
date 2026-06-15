import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

       
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for(int i=0;i<s1.length();i++){
            int c1=s1.charAt(i);
            int c2=s1.
            charAt(i);
            if(c1==c2){
                System.out.print("0");
            }
            else if (c1<c2){
                System.out.print("1");
            }
        }
    }
}
