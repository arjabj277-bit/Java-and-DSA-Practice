import java.util.*;
class hahh{
    public static void main(String[] args){
        Set<String> cars1 = new HashSet<>();
        Set<String> cars2 = new TreeSet<>();

        cars1.add("maruti");cars1.add("kia");cars1.add("Toyota");cars1.add("Marutij");

        cars2.add("BMW");cars2.add("THAR");cars2.add("G-WAGON");cars2.add("MUSTANG");
        System.out.println(cars1);
        System.out.println(cars2);

        if(cars1.contains("maruti")){
            System.out.println("volvo present");
        }
        else{
            System.out.println("volvo not present");
        }
    }
}