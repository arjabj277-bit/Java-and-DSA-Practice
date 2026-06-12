import java.util.*;

public class lst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,1,1,5,6,2,4,4,2,3,5,6,7,8,9,1,4,5);
        Map<Integer , Integer> freqmap = new HashMap <>();

        for(int i : list){
            if (freqmap.containsKey(i)==true) {
                int freqOfKey = freqmap.get(i);
                 freqmap.put(i, freqOfKey+1);

            } 
            else{
               freqmap.put(i,1);
                
            }
        }
        System.out.println(freqmap);
    }
        }

