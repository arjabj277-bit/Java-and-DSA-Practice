import java.util.Scanner;
public class integer {
    static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "enter a number");
        int num = sc.nextInt();

        int sum = SumofDigits("Number");

        System.out.println("Sum of digits = " + sum);
        
        if(sum%5==0 && sum%6==0){
            System.out.print("YES");
        } 
        else if(sum%6==0){
            System.out.print("MAYBE");
        } 
        else if(sum%5==0){
            System.out.print("NO");
        } 
        else{
            System.out.print("INVALID");
        }
    }
}