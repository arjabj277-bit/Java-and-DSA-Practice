import java.util.Scanner;
public class Watermalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a weight:");
        float w = sc.nextInt();
    if((w/2)%2==0){
    System.out.print("YES");
}
else{
    System.out.print("NO");
}
    }
    
} 
