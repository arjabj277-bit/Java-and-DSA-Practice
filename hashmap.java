import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

        int[] arr = {2, 1, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
