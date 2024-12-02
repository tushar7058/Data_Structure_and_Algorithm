package Collections;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // declare arrayList
        list.add(12);
        list.add(13);
        list.add(14);

        list.add(0,11);
        System.out.println(list);

        for(int i =0;i< list.size();i++){
            System.out.println(list.get(i));
            break;
        }
        for(Integer i:list){
            System.out.println("new list through for each loop:"+ i);
            break;
        }
    }
}
