package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
@SuppressWarnings("unused")
public class LearnMap{
    public static void main(String[] args) {

        // Map<String,Integer> mpp = new HashMap<>();
        Map<String,Integer> mpp = new TreeMap<>();

        mpp.put("one", 1);
        mpp.put("two",2);
        mpp.put("three",3);

        System.out.println("map key value pair is:"+mpp);

        //iteration in mapp

        for(Map.Entry<String,Integer>e:mpp.entrySet()){
         

            System.out.println(e.getKey());
            System.out.println(e.getValue());
    
        }    
    }
}