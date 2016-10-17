package kata2;

import java.util.HashMap;

public class Kata2 {
    public static void main(String[] args) {
        int array[] = {2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer,Integer> histogram = new HashMap<>();
        for (int i=0; i<array.length; i++){
            System.out.println(histogram.containsKey(array[i]));
            if(!histogram.containsKey(array[i])) histogram.put(array[i], 1);      
            else histogram.put(array[i], histogram.get(array[i])+1);
        }
        for (int num : histogram.keySet())
            System.out.println(num + " -> " + histogram.get(num));
        }

    }
    

