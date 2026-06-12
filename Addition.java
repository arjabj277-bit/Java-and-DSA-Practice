interface Calculation{
    int add(int a, int b);
}
public class Addition {
    public static void main(String[] args) {
        Calculation obj = (a,b) -> a+b;
        System.out.print(obj.add(5,6));
        
    }
    
}
