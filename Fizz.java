import java.util.Scanner;
public class Fizz {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();

        if (x%3==0 || x%5==0){
            System.out.println(x%3==0);
        }
        else if (x%3==0){
            System.out.println("Fizz");
        }
        else if (x%5==0){
            System.out.println("Buzz");
    }
    else{
        System.out.println(+ x +" - number");
    }

}
}
