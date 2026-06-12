import java.util.*;
public class practicAtcodr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String S = sc.next();//length of N
        String T = sc.next();//length of M

        boolean pref = true;
        boolean suff = true;

        for(int i = 0; i < n; i++){
            if(T.charAt(i) != S.charAt(i)){
                pref = false;
                break;
            }
        }

        for (int j = 0; j < 10; j++) {
            if(S.charAt(j) != T.charAt(m-n+j)){
                suff = false;
                break;

            }
            
        }
        if(pref && suff) System.out.println(0);
        else if (pref) System.out.println(1);
        else if (suff) System.out.println(2);
        else System.out.println(3);
    }
    
}
