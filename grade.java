import java.util.Scanner;
public class grade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your percentage");
        int n1 = sc.nextInt();
        if(n1>100 && n1>90){
            System.out.println("grade A");
        
        }
        else if (n1>89 && n1>80){
            System.out.println("grade b");
        }
        else if (n1>79 && n1>70){
            System.out.println("grade c");
        }
        else if (n1>69 && n1>60){
            System.out.println("grade d");
        }
        else{
            System.out.println("Fail");
        }


        }
}
