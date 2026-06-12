import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> codinglanguage = new ArrayList<>();
        codinglanguage.add("java");
        codinglanguage.add("Python");
        codinglanguage.add("C++");
        codinglanguage.add("JavaScript");

        // 2. Add at a specific index
        codinglanguage.add(1,"Rust");
        codinglanguage.add(3,"Go");

        System.out.println(codinglanguage);

        // 3 . Access and Update
        System.out.println("the value at 2nd index is" + codinglanguage.get(2));
        codinglanguage.set(2,"Anaconda");
        System.out.println(codinglanguage);

        // 4 . Remove elements
         codinglanguage.remove(2);
        System.out.println(codinglanguage); 

        // 5 . Sort List
        Collections.sort(codinglanguage, String.CASE_INSENSITIVE_ORDER );
        System.out.println(codinglanguage);

        for(String s : codinglanguage){
            System.out.println("langauge" + s);

        }

    }
    
}
