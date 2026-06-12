import java.util.Scanner;
public class grad 
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter percentage");
    int n = sc.nextInt();
    if(n>100 && n>90){
        System.out.println("Grade : A");
    }
}    
}
