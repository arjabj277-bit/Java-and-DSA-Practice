import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        int count = 0;
        for(int i=0; i<word.length();i++){
            char s1 = word.charAt(i);
        if(s1 =='a'||s1 =='e'||s1 =='i'||s1 =='o'||s1 =='u'){
            count ++;
        }

        }
        System.out.println(count);
    }
    
}
